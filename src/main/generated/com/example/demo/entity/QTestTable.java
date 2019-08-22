package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTestTable is a Querydsl query type for TestTable
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTestTable extends EntityPathBase<TestTable> {

    private static final long serialVersionUID = 1474232683L;

    public static final QTestTable testTable = new QTestTable("testTable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QTestTable(String variable) {
        super(TestTable.class, forVariable(variable));
    }

    public QTestTable(Path<? extends TestTable> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTestTable(PathMetadata metadata) {
        super(TestTable.class, metadata);
    }

}

