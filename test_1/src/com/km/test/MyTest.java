package com.km.test;

import com.km.test.data.Students;
import com.km.test.model.Student;
import com.km.test.util.StudentUtil;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {

        List<Student> studentList = new Students<Student>().getList();

        System.out.println(StudentUtil.names(studentList));
        System.out.println(StudentUtil.average(studentList));

        StudentUtil.studentsSort(studentList);

        StudentUtil.familyNameNumber(studentList);

        System.out.println(StudentUtil.familyNameNumberMax(studentList));
    }
}
