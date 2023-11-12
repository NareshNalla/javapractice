package com.naresh.consept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mutability {
    public static void main(String[] args) {
        List<Integer> arl =  Arrays.asList(92, 93,95,95,93);
        Student1 s = new Student1("abc",arl );
        System.out.println(arl);
        List<Integer> sc = s.getMarks();
        sc.set(0,40); //sc.add will give exception // sc,set only works
        System.out.println(sc);
        System.out.println(s.getMarks());
        System.out.println(" ....................................");


        Person1 p = new Person1("abc",arl );
        System.out.println(arl);
        List<Integer> pc = p.getGrades();
        pc.set(0,40);
        System.out.println(pc);
        System.out.println(p.getGrades());

    }

}

final class Student1{

    public final String sutdentName;
    public final  List<Integer> studentMarks;

    public Student1(String sutdentName, List<Integer> studentMarks) {
        this.sutdentName = sutdentName;
        this.studentMarks =  studentMarks;
    }
    public List<Integer> getMarks(){
        return List.copyOf(studentMarks);
    }
}

