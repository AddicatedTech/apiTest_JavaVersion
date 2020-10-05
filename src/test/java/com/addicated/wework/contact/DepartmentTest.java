package com.addicated.wework.contact;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department department;

    @BeforeEach  // 该注解意为，在每个测试用例执行之前运行
    void setUp() {
        if (department == null) {
            department = new Department();
        }
    }
    @Test
    void list() {
        Department department = new Department();
        department.list("").then().statusCode(200).body("department.name[0]", equalTo("阿迪测试"));

    }

    @Test
    void create() {
        department.create("seveniruby_d1", "33").then().body("errcode", equalTo(60008));
    }
}