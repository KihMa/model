package com.km.test.util;

import com.km.test.model.Student;

import java.security.PublicKey;
import java.util.*;

public class StudentUtil {

    public static void studentsSort(List<Student> studentList){

        List<Student> students1 = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++){
            students1.add(studentList.get(i));
        }
        students1.sort((s1,s2) -> s2.getScore()-s1.getScore());
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            students.add(students1.get(i));
        }

        for (Student student : students){
            System.out.println(student);
        }
    }

    public static String names(List<Student> studentList){

        StringBuilder builder = new StringBuilder();
        for (Student student : studentList){
            String name = student.getName();
            builder.append(name);
            builder.append(",");
        }

        String strName = builder.toString();
        strName = strName.substring(0,strName.length()-1);
        return strName;
    }

    public static double average(List<Student> studentList){
        double total = 0.0;

        for (Student student : studentList){
            total += student.getScore();
        }
        return total / studentList.size();
    }

    public static void familyNameNumber(List<Student> studentList){

        Map<String, Integer> map = familyNameNumberMap(studentList);

        Set<String> setNameKeys = map.keySet();
        Iterator<String> iterator = setNameKeys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + "-----" + value);
        }
    }

    public static Map<String,Integer> familyNameNumberMap(List<Student> studentList){
        HashMap<String, Integer> map = new HashMap<>();

        for (Student student : studentList){
            String familyChar = student.getName().substring(0,1);
            if (map.containsKey(familyChar)){
                Integer i = map.get(familyChar) + 1;
                map.put(familyChar, i);
            }else {
                map.put(familyChar, 1);
            }
        }
        return map;
    }

    public static String familyNameNumberMax(List<Student> studentList){
        Map<String, Integer> map = familyNameNumberMap(studentList);
        String familyChar = "";
        Integer number = 0;

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            if (map.get(key) > number){
                number = map.get(key);
                familyChar = key;
            }
        }

        return familyChar;
    }
    
}
