package com.example.demo.repository;

import com.example.demo.dto.TestTableDTO;
import com.example.demo.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository  extends JpaRepository<TestTable, Long> {

    // entity 는 바로 받을 수 있음
    @Query(" select t " +
            " from TestTable t" +
            " where t.id > 0L ")
    List<TestTable> getNameList();

    // 생성자를 통하여 DTO 로 받을 수 있음
    @Query(" select new com.example.demo.dto.TestTableDTO( t.id, t.name ) " +
            " from TestTable t " +
            " where t.id > 0L ")
    List<TestTableDTO> getNameListDTO();
}
