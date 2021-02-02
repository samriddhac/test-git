package demo.v33.core.avc.dao.mapper;

import org.mapstruct.Mapper;
import demo.com.framework.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<demo.v33.core.avc.model.Order, demo.v33.core.avc.dao.entity.OrderLine> {}
