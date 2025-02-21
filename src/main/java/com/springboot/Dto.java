package com.springboot;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;

import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
public class Dto {

    Long sabun;
    String name;
    String dept_cd;
    String dept_nm;
    String role_cd;
    String role_nm;
}
