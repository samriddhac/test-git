package demo.v33.core.releasegroup.v1.dao.mapper;

import org.mapstruct.Mapper;
import demo.com.framework.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<
        com.abcd.uop.model.Order, demo.v33.core.releasegroup.v1.dao.entity.OrderMaster> {}
