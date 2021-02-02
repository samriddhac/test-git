package demo.v33.core.demo.v34.dao.mapper;

import org.mapstruct.Mapper;
import demo.com.framework.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<
        demo.v33.core.demo.v34.model.Order, demo.v33.core.demo.v34.dao.entity.OrderLine> {}
