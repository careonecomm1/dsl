package com.dsl.resources;

import com.codahale.metrics.annotation.ExceptionMetered;
import com.codahale.metrics.annotation.Timed;
import com.dsl.controller.ActionTypeController;
import com.dsl.dto.ActionTypeDto;
import io.dropwizard.hibernate.UnitOfWork;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;

import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


@Path("/actions")
@Produces(APPLICATION_JSON)
public class ActionTypeResource {

    private final ActionTypeController actionTypeController;

    @Inject
    public ActionTypeResource(ActionTypeController actionTypeController) {
        this.actionTypeController = actionTypeController;
    }

    @GET
    @Timed
    @ExceptionMetered
    @UnitOfWork(readOnly = true, transactional = false)
    @Path("/types")
    public List<ActionTypeDto> getActionsTypes() {

        return actionTypeController.getAllActionTypes().orElseThrow(() -> new NotFoundException("No such action types."));
    }
}
