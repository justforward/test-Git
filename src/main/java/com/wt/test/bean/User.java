package com.wt.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Auther wangtan
 * @Date 2020/11/23
 */
@Data
@AllArgsConstructor
public class User {
    private String username;
    private Integer userId;
    private Integer version;
    private Date date;

}
