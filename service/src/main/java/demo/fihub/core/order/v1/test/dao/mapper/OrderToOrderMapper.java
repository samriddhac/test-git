package demo.fihub.core.order.v1.test.dao.mapper;

import org.mapstruct.Mapper;
import com.macys.order.foundation.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<
        demo.fihub.core.order.v1.test.model.Order,
        demo.fihub.core.order.v1.test.dao.entity.OrderLine> {}
