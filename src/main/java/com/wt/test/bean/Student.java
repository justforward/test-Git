package com.wt.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Auther wangtan
 * @Date 2020/11/24
 */
@Data
@AllArgsConstructor
public class Student {
    private Integer studentId;
    private String studentName;
    private List<String> stringList;
}
