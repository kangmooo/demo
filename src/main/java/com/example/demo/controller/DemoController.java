package com.example.demo.controller;

import com.example.demo.entity.TestTable;
import com.example.demo.repository.DemoQueryDslRepository;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @Autowired private DemoQueryDslRepository demoQueryDslRepository;
    @Autowired private DemoRepository demoRepository;

//    public DemoController(DemoQueryDslRepository demoQueryDslRepository, DemoRepository demoRepository) {
//        this.demoQueryDslRepository = demoQueryDslRepository;
//        this.demoRepository = demoRepository;
//    }

    @GetMapping("/test")
    public String test(){
        List<String> nameList = demoQueryDslRepository.getNameList();
        String name = demoQueryDslRepository.getName();
        List<TestTable> allUserList = demoRepository.getNameList();

        return "what's up world ~!";
    }

}
