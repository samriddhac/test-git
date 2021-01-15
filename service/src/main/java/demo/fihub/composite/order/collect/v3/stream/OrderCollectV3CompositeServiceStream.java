package demo.fihub.composite.order.collect.v3.stream;

import java.util.function.Consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.cloud.stream.binder.RequeueCurrentMessageException;
import com.macys.msa.foundation.core.utils.message.validation.MessageValidator;

import demo.fihub.composite.order.collect.v3.IOrderCollectV3CompositeServiceStream;
import com.macys.order.foundation.core.utils.execution.StreamContextUtil;

import brave.SpanCustomizer;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@EnableAutoConfiguration
public class OrderCollectV3CompositeServiceStream implements StreamContextUtil {
  private final IOrderCollectV3CompositeServiceStream orderCollectV3CompositeServiceStream;
  private final SpanCustomizer spanCustomizer;
  private final MessageValidator messageValidator;
}
