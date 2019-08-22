package com.example.demo.repository;

import com.example.demo.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository  extends JpaRepository<TestTable, Long> {

    @Query(" select t " +
            " from TestTable t" +
            " where t.id > 0L ")
    List<TestTable> getNameList();
}
