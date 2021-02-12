package demo.order.v1.core.gb.dao.mapper;

import org.mapstruct.Mapper;
import com.macys.mst.order.foundation.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<
        com.abcd.uop.model.Order, demo.order.v1.core.gb.dao.entity.OrderMaster> {}
