package com.example.demo.repository;

import com.example.demo.entity.QTestTable;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DemoQueryDslRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final QTestTable qTestTable = QTestTable.testTable;

    // 단일 조회
    public String getName(){
        return jpaQueryFactory.from(qTestTable).where(qTestTable.id.eq(1L)).select(qTestTable.name).fetchOne();
    }

    // list 조회
    public List<String> getNameList(){
        return jpaQueryFactory.from(qTestTable).where(qTestTable.id.eq(1L)).select(qTestTable.name).fetch();
    }
}
