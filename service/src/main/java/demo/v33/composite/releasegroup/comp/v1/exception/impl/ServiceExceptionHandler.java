package demo.v33.composite.releasegroup.comp.v1.exception.impl;

import org.aspectj.lang.JoinPoint;
import org.zalando.problem.Status;
import org.zalando.problem.ThrowableProblem;

import demo.com.framework.core.utils.CommonStatusCode;
import demo.com.framework.core.utils.exception.ExceptionHandler;
import demo.com.framework.core.utils.exception.ProblemUtil;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.logging.LoggingUtil;

public class ServiceExceptionHandler
    implements ExceptionHandler, ServiceContextUtil, ProblemUtil, LoggingUtil {

  @Override
  public void handleException(JoinPoint joinPoint, Throwable error) {
    // HINT: your code goes here...
    if (error instanceof ThrowableProblem) {
      throw (ThrowableProblem) error;
    } else {
      getErrorLogMessageBuilder(
              CommonStatusCode.INTERNAL_SERVICE_ERROR.getCode(),
              CommonStatusCode.INTERNAL_SERVICE_ERROR.getDescription(),
              error)
          .build()
          .logAsError();
      throw createProblem(
          Status.INTERNAL_SERVER_ERROR.getStatusCode(),
          CommonStatusCode.INTERNAL_SERVICE_ERROR.getCode(),
          CommonStatusCode.INTERNAL_SERVICE_ERROR.getDescription(),
          error);
    }
  }
}
