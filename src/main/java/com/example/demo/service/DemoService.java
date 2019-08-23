package com.example.demo.service;

import com.example.demo.dto.TestTableDTO;
import com.example.demo.entity.TestTable;

import java.util.List;

public interface DemoService {
    String getName();                           // 단일 조회(queryDsl)
    List<String> getNameList();                 // list 조회(queryDsl)
    List<TestTable> getUserList();              // entity 로 list 조회
    List<TestTableDTO> getUserDTOList();        // DTO 로 list 조회
}
