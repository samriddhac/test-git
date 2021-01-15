package demo.fihub.core.order.exception.impl;

import java.net.URI;

import org.aspectj.lang.JoinPoint;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;
import org.zalando.problem.ThrowableProblem;

import com.macys.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.order.foundation.core.utils.exception.ExceptionHandler;

public class ServiceExceptionHandler implements ExceptionHandler, ServiceContextUtil {

  @Override
  public void handleException(JoinPoint joinPoint, Throwable error) {
    // HINT: your code goes here...
    if (error instanceof ThrowableProblem) {
      throw (ThrowableProblem) error;
    } else {
      throw Problem.builder()
          .withType(URI.create(getServiceRequestContext().getUrl()))
          .withTitle("service exception")
          .withStatus(Status.BAD_REQUEST)
          .withDetail(error.getMessage())
          .build();
    }
  }
}
