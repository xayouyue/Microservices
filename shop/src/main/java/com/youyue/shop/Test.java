package com.youyue.shop;

import java.util.Date;

public class Test {

    public Student getStudent(String name,int age) {
        return Student.newStudent()
                .name(name)
                .age(age)
                .build();
    }

    public static void main(String[] args) {
        Student student = Student.newStudent()
                .build();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ")
                .append("id,name,sex")
                .append(" FROM user");
        if(id!=null) {
            sb.append("WHERE id=").append(id);
        }
        sb.toString();
        System.out.println(student);
    }
}
