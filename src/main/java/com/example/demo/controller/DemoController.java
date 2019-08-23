package com.example.demo.controller;

import com.example.demo.dto.TestTableDTO;
import com.example.demo.entity.TestTable;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/demo")
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/test")
    public String test(){

        String name = demoService.getName();                         // 단일 조회(queryDsl)
        List<String> nameList = demoService.getNameList();           // list 조회(queryDsl)
        List<TestTable> allUserList = demoService.getUserList();             // entity 로 list 조회
        List<TestTableDTO> allUserListDTO = demoService.getUserDTOList();    // DTO 로 list 조회
        log.info("name : {}",name);
        log.info("nameList : {}",nameList);
        log.info("allUserList : {}", allUserList);
        log.info("allUserListDTO : {}", allUserListDTO);
        log.info("allUserListDTO : "+allUserListDTO);
        return "what's up world ~!";
    }

}


