package com.example.demo.repository;

import com.example.demo.entity.QTestTable;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
//@RequiredArgsConstructor
public class DemoQueryDslRepository {

    private final JPAQueryFactory jpaQueryFactory;

    private final QTestTable qTestTable = QTestTable.testTable;

    public DemoQueryDslRepository(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<String> getNameList(){
        return jpaQueryFactory.from(qTestTable).where(qTestTable.id.eq(1L)).select(qTestTable.name).fetch();
    }

    public String getName(){
        return jpaQueryFactory.from(qTestTable).where(qTestTable.id.eq(1L)).select(qTestTable.name).fetchOne();
    }
}
