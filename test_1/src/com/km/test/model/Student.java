package com.km.test.model;

public class Student {

    private String name;

    private String sex;

    private Integer score;

    private Integer age;

    public Student() {
    }

    public Student(String name, String sex, Integer score, Integer age) {
        this.name = name;
        this.sex = sex;
        this.score = score;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}
