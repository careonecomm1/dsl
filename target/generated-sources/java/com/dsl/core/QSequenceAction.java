package com.dsl.core;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QSequenceAction is a Querydsl query type for SequenceAction
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSequenceAction extends EntityPathBase<SequenceAction> {

    private static final long serialVersionUID = 296236168L;

    public static final QSequenceAction sequenceAction = new QSequenceAction("sequenceAction");

    public final NumberPath<Long> actionId = createNumber("actionId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> sequenceId = createNumber("sequenceId", Long.class);

    public QSequenceAction(String variable) {
        super(SequenceAction.class, forVariable(variable));
    }

    public QSequenceAction(Path<? extends SequenceAction> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSequenceAction(PathMetadata<?> metadata) {
        super(SequenceAction.class, metadata);
    }

}

