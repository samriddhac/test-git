package demo.order.v1.core.shipment.v4.dao.mapper;

import org.mapstruct.Mapper;
import com.macys.mst.order.foundation.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface ReturnOrderToReturnOrderMapper
    extends AbstractMapper<
        com.abcd.uop.returning.model.Order,
        demo.order.v1.core.shipment.v4.dao.entity.OrderMaster> {}
