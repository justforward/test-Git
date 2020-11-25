package com.wt.test;

import com.wt.test.bean.Student;
import com.wt.test.bean.User;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Auther wangtan
 * @Date 2020/11/24
 */
public class CollectionEmpty {
    public static void main(String[] args) {
//        Student student=new Student(1,"li",Arrays.asList());
//        Student student1=new Student(1,"sa",Arrays.asList());
//       // List<User> list= Arrays.asList(user1,user11);
//        List<Student> list1=Arrays.asList();
//        list1.forEach(v->{
//            List<String> stringList=v.getStringList();
//            stringList.forEach(m->{
//                System.out.println("mmm");
//            });
//        });

        List<String> list1=Arrays.asList("dark_horse");
        List<String> list2=Arrays.asList("dark_horse");

        if(list1.size()!=list2.size()){
            System.out.println("yyy");
        }
        if(list1.containsAll(list2)){
            System.out.println("list1==list2");
        }


    }
}
