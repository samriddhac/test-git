package demo.order.v1.core.bcdfe.v1.dao.mapper;

import org.mapstruct.Mapper;
import com.macys.mst.order.foundation.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface BadOrderToBadOrderMapper
    extends AbstractMapper<
        com.abcd.uop.model.BadOrder, demo.order.v1.core.bcdfe.v1.dao.entity.OrderMaster> {}
