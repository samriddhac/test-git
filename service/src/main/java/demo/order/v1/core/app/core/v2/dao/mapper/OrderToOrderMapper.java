package demo.order.v1.core.app.core.v2.dao.mapper;

import org.mapstruct.Mapper;
import com.macys.mst.order.foundation.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<
        com.abcd.uop.model.Order, demo.order.v1.core.app.core.v2.dao.entity.OrderMaster> {}
