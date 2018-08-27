package com.dsl.dao;

import com.dsl.core.ActionType;
import org.hibernate.SessionFactory;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public class ActionTypeDao extends EntityDao<ActionType>{

    @Inject
    public ActionTypeDao(SessionFactory factory) {
        super(factory);
    }

    public Optional<ActionType> findById(Long id) {
        return Optional.ofNullable(get(id));
    }

    public ActionType create(ActionType hotel) {
        return persist(hotel);
    }

    public Optional<List<ActionType>> findAllActionTypes() {

        return Optional.ofNullable(list(namedQuery("com.dsl.core.ActionType.findAllActionTypes")));
    }
}
