package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.sql.*;
import java.util.zip.DataFormatException;


class Student implements Cloneable {
    String name;
    int age;

    public Student clone() throws CloneNotSupportedException
    {
        Student stu=(Student)super.clone();
        return stu;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class Main {

    public static void main(String[] args) throws InterruptedException, ParseException, CloneNotSupportedException {

        Student stu = new Student("yasen", 18);
        Student stu1=stu;
        stu1.setName("ha");
        Student clone=stu.clone();
        clone.setName("clone");
        System.out.println(stu.getName());
        System.out.println(clone.getName());
    }
}
