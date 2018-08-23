package com.dsl.core;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QHotel is a Querydsl query type for Hotel
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHotel extends EntityPathBase<Hotel> {

    private static final long serialVersionUID = -1006973085L;

    public static final QHotel hotel = new QHotel("hotel");

    public final NumberPath<Long> cit_id = createNumber("cit_id", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath main_picture = createString("main_picture");

    public final StringPath name = createString("name");

    public final NumberPath<Long> stars = createNumber("stars", Long.class);

    public QHotel(String variable) {
        super(Hotel.class, forVariable(variable));
    }

    public QHotel(Path<? extends Hotel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHotel(PathMetadata<?> metadata) {
        super(Hotel.class, metadata);
    }

}

