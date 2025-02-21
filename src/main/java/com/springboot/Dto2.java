package com.springboot;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
public class Dto2 {
    Long id;
    String dept_cd;
    String dept_rm;
    Long level;
    String rel_dept_cd;
    String rel_dept_nm;

}
