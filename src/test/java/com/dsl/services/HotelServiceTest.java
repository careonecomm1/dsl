package com.dsl.services;

import com.dsl.core.ActionType;
import com.dsl.service.ActionTypeService;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HotelServiceTest {

    private ActionTypeService actionTypeService;

    @Before
    public void setUp(){
        actionTypeService = new ActionTypeService();
    }

    @Test
    public void loadHotels(){
        assertThat(actionTypeService.getActionTypes().isEmpty(),is(false));
    }
}
