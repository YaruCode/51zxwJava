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

    public Student clone() throws CloneNotSupportedException {
        Student stu = (Student) super.clone();
        return stu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

       // MyReflect.Execute();
        Stack<>

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int cnt = map.get(nums[i]);
                map.replace(nums[i], cnt + 1);
            }
        }
        int[] ans = new int[k];
        // int index=0;

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Map.Entry<Integer, Integer> en1 = (Map.Entry<Integer, Integer>) o1;
                Map.Entry<Integer, Integer> en2 = (Map.Entry<Integer, Integer>) o2;
                return en2.getValue().compareTo(en1.getValue());
            }


//            public int compare(Map.Entry<Integer,Integer> entry1,Map.Entry<Integer,Integer> entry2)
//            {
//                return entry2.getValue()-(entry1.getValue());//降序排序
//            }
        });
        int index = 0;
        while (index < k) {
            ans[index++] = list.get(list.size() - 1 - index).getKey();
        }
        return ans;
    }


    public static void collectionOperation() {

        List<Integer> list = new ArrayList<>(10);
        list.add(3);
        list.add(23);
        list.add(100);
        list.add(100);
        list.add(100);
        list.add(100);


        List<Integer> copy = new ArrayList<>();
        Collections.copy(list, copy);


        copy.forEach(x -> System.out.println(x));


//        int f=Collections.frequency(list,100);
//        System.out.println(f);
//

//        System.out.println("Max="+Collections.max(list));
//        System.out.println("Min="+Collections.min(list));


//
//        System.out.println("before rotate");
//        list.forEach(x-> System.out.println(x));
//        Collections.rotate(list,1);
//        System.out.println("after rotated");
//        list.forEach(x-> System.out.println(x));


//
//        List<Student> students=new ArrayList<>();
//        Student stu1=new Student("a",19);
//        Student stu2=new Student("b",25);
//        Student stu3=new Student("c",45);
//        //students.add(stu3);
//        students.add(stu2);
//        students.add(stu1);
//        System.out.println("before swap");
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
//
//        Collections.swap(students,0,1);
//        System.out.println("after swapped");
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
//


//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        System.out.println("after sorted");
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
//
//
//
//


    }


    public static void mapTraverse() {

        //通过key值进行排序
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(26, "z");
        map.put(3, "c");
        map.put(5, "e");

        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key=" + key + "\t" + "value=" + value);
        }


        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key=" + entry.getKey() + "\t" + "value=" + entry.getValue());
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey() + "\t" + "value=" + entry.getValue());
        }


    }


    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Checked(c)) {
                continue;
            }
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.replace(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        int cnt = 0;
        for (; ; ) {
            if (map.containsKey('b') && map.get('b') >= 1) {
                int count = map.get('b');
                map.replace('b', count - 1);
            } else {
                break;
            }
            if (map.containsKey('a') && map.get('a') >= 1) {
                int count = map.get('a');
                map.replace('a', count - 1);
            } else {
                break;
            }
            if (map.containsKey('l') && map.get('l') >= 2) {
                int count = map.get('l');
                map.replace('l', count - 2);
            } else {
                break;
            }
            if (map.containsKey('o') && map.get('o') >= 2) {
                int count = map.get('o');
                map.replace('o', count - 2);
            } else {
                break;
            }
            if (map.containsKey('n') && map.get('n') >= 1) {
                int count = map.get('n');
                map.replace('n', count - 1);
            } else {
                break;
            }
            cnt += 1;
        }
        return cnt;
    }

    public static boolean Checked(char c) {
        return c == 'b' ||
                c == 'a' ||
                c == 'l' ||
                c == 'o' ||
                c == 'n';
    }

    public static void Sort(int[] nums) {
        nums[0] = 100;
    }
}
