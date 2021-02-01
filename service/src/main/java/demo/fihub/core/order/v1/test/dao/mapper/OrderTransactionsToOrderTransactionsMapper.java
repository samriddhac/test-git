package demo.fihub.core.order.v1.test.dao.mapper;

import org.mapstruct.Mapper;
import com.macys.order.foundation.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderTransactionsToOrderTransactionsMapper
    extends AbstractMapper<
        demo.fihub.core.order.v1.test.model.OrderTransactions,
        demo.fihub.core.order.v1.test.dao.entity.OrderLine> {}
