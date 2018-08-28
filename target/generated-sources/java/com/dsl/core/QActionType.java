package com.dsl.core;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QActionType is a Querydsl query type for ActionType
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QActionType extends EntityPathBase<ActionType> {

    private static final long serialVersionUID = -904618431L;

    public static final QActionType actionType = new QActionType("actionType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath label = createString("label");

    public final StringPath name = createString("name");

    public QActionType(String variable) {
        super(ActionType.class, forVariable(variable));
    }

    public QActionType(Path<? extends ActionType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QActionType(PathMetadata<?> metadata) {
        super(ActionType.class, metadata);
    }

}

