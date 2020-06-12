package com.youyue.shop;

import java.util.Date;

public class Student {

    private String name;
    private int age;
    private String sex;
    private Date brithday;
    private String address;

    public Student() {
    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.brithday = builder.brithday;
        this.address = builder.address;
    }

    public static Builder newStudent() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", brithday=" + brithday +
                ", address='" + address + '\'' +
                '}';
    }

    public static final class Builder {
        private String name = "kissli";
        private int age = 10;
        private String sex = "男";
        private Date brithday = new Date();
        private String address = "";

        private Builder() {
        }

        public Student build() {
            return new Student(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder brithday(Date brithday) {
            this.brithday = brithday;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
    }
}
