package com.dsl.mapper;

import com.dsl.core.ActionType;
import com.dsl.dto.ActionTypeDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;

import java.io.IOException;

public class ActionTypeMapper implements Mapper<ActionTypeDto, ActionType>{

    private static final Logger LOGGER = Logger.getLogger(ActionTypeMapper.class);

    public ActionTypeMapper() {}

    @Override
    public void updateEntity(ActionType entity, ActionTypeDto dto) {}

    @Override
    public ActionType createEntity(Class<?> dtoClass) {
        return new ActionType();
    }

    @Override
    public ActionTypeDto createApiDto(ActionType entity) {
        
        ObjectMapper mapper = new ObjectMapper();

        ActionTypeDto actionTypeDto = new ActionTypeDto(
                entity.getId(),
                entity.getName(),
                entity.getLabel());
        return actionTypeDto;
    }
}

