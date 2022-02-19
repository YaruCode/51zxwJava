package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.*;
import java.util.Date;
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

        Timer timer=new Timer();
        //里面的run方法名是固定写法
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务被执行了");
            }
        };
        //第一个参数是需要做的任务，第二个参数是从现在开始的延时时间
        //单位是毫秒
//        timer.schedule(task,3000);

        //可以指定执行的时间点
        timer.schedule(task,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-3-1 12:23:34"));



    }
}
