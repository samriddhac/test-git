package demo.v33.core.avc.v5.dao.mapper;

import org.mapstruct.Mapper;
import demo.com.framework.core.utils.mapper.AbstractMapper;

@Mapper(componentModel = "spring")
public interface OrderToOrderMapper
    extends AbstractMapper<
        demo.v33.core.avc.v5.model.Order, demo.v33.core.avc.v5.dao.entity.OrderLine> {}
