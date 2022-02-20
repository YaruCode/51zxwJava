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


        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,100);
        map.put(7,700);
        map.put(4,400);
        map.put(2,200);
       MapSort();



    }

    public static void MapSort()
    {
        //通过key值进行排序
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(26,"z");
        map.put(3,"c");
        map.put(5,"e");

        for(Integer key:map.keySet())
        {
            String value=map.get(key);
            System.out.println("key="+key+"\t"+"value="+value);
        }









//        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
//        while(iterator.hasNext())
//        {
//            Map.Entry<Integer,String> entry=iterator.next();
//            System.out.println("key="+entry.getKey()+"\t"+"value="+entry.getValue());
//        }
//        for(Map.Entry<Integer,String> entry:map.entrySet())
//        {
//            System.out.println("key="+entry.getKey()+"\t"+"value="+entry.getValue());
//        }







    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap();

        for(int i=0;i<text.length();i++)
        {
            char c=text.charAt(i);
            if(!Checked(c))
            {
                continue;
            }
            if(map.containsKey(c))
            {
                int count=map.get(c);
                map.replace(c,count+1);
            }else
            {
                map.put(c,1);
            }
        }

        int cnt=0;
        for(;;)
        {
            if(map.containsKey('b') && map.get('b')>=1)
            {
                int count=map.get('b');
                map.replace('b',count-1);
            }else{
                break;
            }
            if(map.containsKey('a') && map.get('a')>=1)
            {
                int count=map.get('a');
                map.replace('a',count-1);
            }else{
                break;
            }
            if(map.containsKey('l') && map.get('l')>=2)
            {
                int count=map.get('l');
                map.replace('l',count-2);
            }else{
                break;
            }
            if(map.containsKey('o') && map.get('o')>=2)
            {
                int count=map.get('o');
                map.replace('o',count-2);
            }else{
                break;
            }
            if(map.containsKey('n') && map.get('n')>=1)
            {
                int count=map.get('n');
                map.replace('n',count-1);
            }else{
                break;
            }
            cnt+=1;
        }
        return cnt;
    }
    public static boolean Checked(char c)
    {
        return c=='b'||
                c== 'a' ||
                c== 'l' ||
                c=='o' ||
                c=='n';
    }
    public static void Sort(int[] nums)
    {
        nums[0]=100;
    }
}
