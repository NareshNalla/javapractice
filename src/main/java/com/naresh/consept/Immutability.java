package com.naresh.consept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Immutability {
    public static void main(String[] args) {
        List<Integer> arl =  Arrays.asList(92, 93,95,95,93);
        Student s = new Student("abc",arl );
        System.out.println(arl);
        List<Integer> sc = s.getMarks();
        sc.set(0,40); //sc.add will give exception // sc,set only works
        System.out.println(sc);
    }

}

final class Student{

  public  String sutdentName;
  public   List<Integer> studentMarks;

    public Student(String sutdentName, List<Integer> studentMarks) {
        this.sutdentName = sutdentName;
        this.studentMarks = studentMarks;
    }
    public List<Integer> getMarks(){
        return this.studentMarks;
    }
}

record Person(String name, int age) {}