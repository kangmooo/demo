package com.example.demo.service;

import com.example.demo.dto.TestTableDTO;
import com.example.demo.entity.TestTable;
import com.example.demo.repository.DemoQueryDslRepository;
import com.example.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService{

    private final DemoQueryDslRepository demoQueryDslRepository;
    private final DemoRepository demoRepository;

    @Override
    public String getName() {
        return demoQueryDslRepository.getName();
    }

    @Override
    public List<String> getNameList() {
        return demoQueryDslRepository.getNameList();
    }

    @Override
    public List<TestTable> getUserList() {
        return demoRepository.getNameList();
    }

    @Override
    public List<TestTableDTO> getUserDTOList() {
        return demoRepository.getNameListDTO();
    }
}
