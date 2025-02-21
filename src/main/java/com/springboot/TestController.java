package com.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String getHello () {
        return "Hello World";
    }

    @GetMapping("/member/{sabun}")
    public ResponseEntity getMember(@PathVariable("sabun") Long sabun) {
        return new ResponseEntity<>(
                new Dto(1L,
                "hong gildong",
                "CS001023004",
                "컨테이너 실습",
                "EEF9852",
                "STUDENT"), HttpStatus.OK
        );
    }

    @GetMapping("/dept/{deptId}")
    public ResponseEntity getDept(@PathVariable("deptId") Long deptId) {
        return new ResponseEntity(
                new Dto2(1L,
                        "CS001023004",
                        "컨테이너 실습",
                        3L,
                        "CS0010230000",
                        "수강생대표팀"
                ), HttpStatus.OK
        );
    }
}
