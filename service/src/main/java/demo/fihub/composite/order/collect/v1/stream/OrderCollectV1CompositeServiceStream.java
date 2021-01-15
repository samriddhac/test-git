package demo.fihub.composite.order.collect.v1.stream;

import java.util.function.Consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.cloud.stream.binder.RequeueCurrentMessageException;
import com.macys.msa.foundation.core.utils.message.validation.MessageValidator;

import demo.fihub.composite.order.collect.v1.IOrderCollectV1CompositeServiceStream;
import com.macys.order.foundation.core.utils.execution.StreamContextUtil;

import brave.SpanCustomizer;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@EnableAutoConfiguration
public class OrderCollectV1CompositeServiceStream implements StreamContextUtil {
  private final IOrderCollectV1CompositeServiceStream orderCollectV1CompositeServiceStream;
  private final SpanCustomizer spanCustomizer;
  private final MessageValidator messageValidator;
}
