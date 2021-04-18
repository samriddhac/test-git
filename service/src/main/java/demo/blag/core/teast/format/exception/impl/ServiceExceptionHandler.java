package demo.blag.core.teast.format.exception.impl;

import demo.cosmos.core.utils.CommonStatusCode;
import demo.cosmos.core.utils.exception.ExceptionHandler;
import demo.cosmos.core.utils.exception.ProblemUtil;
import demo.cosmos.core.utils.execution.ServiceContextUtil;
import demo.cosmos.core.utils.logging.LoggingUtil;
import org.aspectj.lang.JoinPoint;
import org.zalando.problem.Status;
import org.zalando.problem.ThrowableProblem;

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
