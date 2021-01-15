package demo.fihub.composite.order.collect.v2.stream;

import java.util.function.Consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;
import org.springframework.cloud.stream.binder.RequeueCurrentMessageException;
import com.macys.msa.foundation.core.utils.message.validation.MessageValidator;

import demo.fihub.composite.order.collect.v2.IOrderCollectV2CompositeServiceStream;
import com.macys.order.foundation.core.utils.execution.StreamContextUtil;

import brave.SpanCustomizer;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@EnableAutoConfiguration
public class OrderCollectV2CompositeServiceStream implements StreamContextUtil {
  private final IOrderCollectV2CompositeServiceStream orderCollectV2CompositeServiceStream;
  private final SpanCustomizer spanCustomizer;
  private final MessageValidator messageValidator;
}
