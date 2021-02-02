package demo.v33.core.avc.exception.impl;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.zalando.problem.Status;

import demo.com.framework.core.utils.CommonStatusCode;
import demo.com.framework.core.utils.exception.ErrorDetail;
import demo.com.framework.core.utils.exception.ExceptionHandler;
import demo.com.framework.core.utils.exception.ProblemUtil;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.logging.LoggingUtil;

import io.grpc.StatusRuntimeException;

public class DataExceptionHandler
    implements ExceptionHandler, ServiceContextUtil, ProblemUtil, LoggingUtil {

  @Override
  public void handleException(JoinPoint joinPoint, Throwable error) {
    // HINT: your code goes here...
    Throwable throwable = ExceptionUtils.getRootCause(error);
    StatusRuntimeException sre = null;
    if (throwable instanceof io.grpc.StatusRuntimeException) {
      sre = (StatusRuntimeException) throwable;
      demo.com.framework.core.utils.exception.Error dataError =
          demo.com.framework.core.utils.exception.Error.builder()
              .withCode(CommonStatusCode.DB_ERROR.getCode())
              .withMessage(CommonStatusCode.DB_ERROR.getDescription())
              .withErrorDetail(
                  ErrorDetail.builder()
                      .withDomain(getServiceRequestContext().getApplicationName())
                      .withReason("Spanner Error")
                      .withMessage(sre.getMessage())
                      .withLocation("Spanner Database")
                      .build())
              .build();
      getErrorLogMessageBuilder(
              CommonStatusCode.DB_ERROR.getCode(),
              CommonStatusCode.DB_ERROR.getDescription(),
              error)
          .build()
          .logAsError();
      throw createProblem(Status.INTERNAL_SERVER_ERROR.getStatusCode(), dataError, error);
    } else {
      getErrorLogMessageBuilder(
              CommonStatusCode.DB_ERROR.getCode(),
              CommonStatusCode.DB_ERROR.getDescription(),
              error)
          .build()
          .logAsError();
      throw createProblem(
          Status.INTERNAL_SERVER_ERROR.getStatusCode(),
          CommonStatusCode.DB_ERROR.getCode(),
          CommonStatusCode.DB_ERROR.getDescription(),
          error);
    }
  }
}
