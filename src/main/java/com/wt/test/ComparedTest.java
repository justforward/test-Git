package com.wt.test;

import com.alibaba.fastjson.JSON;
import com.wt.test.bean.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther wangtan
 * @Date 2020/11/23
 */
public class ComparedTest {
    public static void main(String[] args) throws InterruptedException {

        User user1=new User("li",1,1,new Date());
        User user11=new User("li",1,2,new Date());
        Thread.sleep(2000);
        User user2=new User("za",2,1,new Date());
        User user3=new User("ka",3,1,new Date());
        Thread.sleep(2000);
        User user12=new User("li",1,3,new Date());
        User user21=new User("za",2,2,new Date());
        Thread.sleep(2000);
        User user13=new User("li",1,5,new Date());
        Thread.sleep(2000);
        User user31=new User("ka",3,2,new Date());
        Thread.sleep(2000);
        User user14=new User("li",1,4,new Date());
        List<User> list= Arrays.asList(user1,user3,user2,user11,user12,user14,user21,user31,user13);
        List<User> m=list.stream().sorted(Comparator.comparing(User::getUserId).
                thenComparing(User::getVersion).thenComparing(User::getDate)).
                collect(Collectors.toList());
//        Collections.sort(list,new Comparator<Object>() {
//            public int compare(Object o1, Object o2) {
//                User s1 = (User) o1;
//                User s2 = (User) o2;
//                //如果前者的版本大于后者的版本号，返回1。系统就会识别是前者大于后者
//                if (s1.getUserId() > s2.getUserId()) {
//                    return 1;
//                } else if (s1.getUserId() < s2.getUserId()) {
//                    return -1;
//                } else if (s1.getUserId().equals(s2.getUserId())) {
//                    return s1.getVersion().compareTo(s2.getVersion());
//                }
//                return 0;
//            }
//        });
        System.out.println(JSON.toJSONString(m));
    }
}
