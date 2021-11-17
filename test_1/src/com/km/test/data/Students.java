package com.km.test.data;

import com.km.test.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Students<E> {

    public List<E> getList(){
        List<E> students = new ArrayList<>();

        Student student1 = new Student("张三", "男", 85, 23);
        Student student2 = new Student("李四", "男", 60, 24);
        Student student3 = new Student("王五", "男", 45, 26);
        Student student4 = new Student("赵六", "男", 88, 21);
        Student student5 = new Student("小丽", "女", 73, 28);
        Student student6 = new Student("小红", "女", 95, 19);
        Student student7 = new Student("小兰", "女", 66, 20);
        Student student8 = new Student("小爱", "女", 83, 23);
        Student student9 = new Student("汤姆", "男", 59, 22);
        Student student10 = new Student("杰润", "女", 89, 27);

        students.add((E) student1);
        students.add((E) student2);
        students.add((E) student3);
        students.add((E) student4);
        students.add((E) student5);
        students.add((E) student6);
        students.add((E) student7);
        students.add((E) student8);
        students.add((E) student9);
        students.add((E) student10);
        return students;
    }
}
