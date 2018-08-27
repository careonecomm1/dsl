package com.dsl.service;

import com.dsl.dto.ActionTypeDto;

import java.util.List;

public class ActionTypeService {

    private static List<ActionTypeDto> actionTypeDtoList;

    public List<ActionTypeDto> getActionTypes() {
        return actionTypeDtoList;
    }

    public ActionTypeService() {

    }
}
