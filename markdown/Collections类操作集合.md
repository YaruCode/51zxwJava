# Collections类操作集合
Collections类是Java提供的操作Set,List和Map等集合的工具类。Collections提供了许多操作集合的静态方法，借助这些静态方法可以实现集合元素
的排序、查找替换和复制等操作。下面介绍Colelctions类中常用的方法

### 排序(正向和逆向)
Collections类提供了如下方法对List集合元素进行排序
* void reverse(List list):对指定的元素集合进行逆向排序
```java
List<Integer> list=new ArrayList<>();
list.add(100);
list.add(3);
list.add(23);
System.out.println("before revesed");
list.forEach(x-> System.out.println(x));
Collections.reverse(list)
System.out.println("after revesed");
list.forEach(x-> System.out.println(x));
//运行结果
before revesed
100
3
23
after revesed
23
3
100
```
* void shuffle(List list):对list集合进行随机排序，即打乱顺序
```java

List<Integer> list=new ArrayList<>();
list.add(100);
list.add(3);
list.add(23);
System.out.println("before shuffled");
list.forEach(x-> System.out.println(x));
Collections.shuffle(list);
System.out.println("after shuffled");
list.forEach(x-> System.out.println(x));
//运行结果
before shuffled
100
3
23
after shuffled
3
23
100
```
* void sort(List list):对传入的集合按照升序进行排序
```java
List<Integer> list=new ArrayList<>();
list.add(100);
list.add(3);
list.add(23);
System.out.println("before sorted");
list.forEach(x-> System.out.println(x));
Collections.sort(list);
System.out.println("after sort");
list.forEach(x-> System.out.println(x));

//运行结果
before sorted
100
3
23
after sort
3
23
100

```
* void sort(List list,Comparator c):根据Comparator指定的规则对list进行排序
```java
//定义学生类
class Student implements Cloneable {
    String name;
    int age;

    public Student clone() throws CloneNotSupportedException {
        Student stu = (Student) super.clone();
        return stu;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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


//按照自定义比较器来排序
List<Student> students=new ArrayList<>();
Student stu1=new Student("a",19);
Student stu2=new Student("b",25);
Student stu3=new Student("c",45);
students.add(stu3);
students.add(stu2);
students.add(stu1);
System.out.println("before sort");
for (Student student : students) {
    System.out.println(student.toString());
}
Collections.sort(students, new Comparator<Student>() {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
});
System.out.println("after sorted");
for (Student student : students) {
    System.out.println(student.toString());
}
//运行结果
before sort
Student{name='c', age=45}
Student{name='b', age=25}
Student{name='a', age=19}
after sorted
Student{name='a', age=19}
Student{name='b', age=25}
Student{name='c', age=45}
```
* void swap(List list,int i,int j):将集合list中的两个下表位置的元素呼唤
```java
List<Student> students=new ArrayList<>();
Student stu1=new Student("a",19);
Student stu2=new Student("b",25);
Student stu3=new Student("c",45);
//students.add(stu3);
students.add(stu2);
students.add(stu1);
System.out.println("before swap");
for (Student student : students) {
    System.out.println(student.toString());
}

Collections.swap(students,0,1);
System.out.println("after swapped");
for (Student student : students) {
    System.out.println(student.toString());
}
//运行结果
before swap
Student{name='b', age=25}
Student{name='a', age=19}
after swapped
Student{name='a', age=19}
Student{name='b', age=25}
```
* void rotate(List list,int distance):旋转集合。distance大于零时向右旋转，distance小于0时向左旋转
```java
List<Integer> list=new ArrayList<>();
list.add(100);
list.add(3);
list.add(23);

System.out.println("before rotate");
list.forEach(x-> System.out.println(x));
Collections.rotate(list,1);
System.out.println("after rotated");
list.forEach(x-> System.out.println(x));
//运行结果
before rotate
100
3
23
after rotated
23
100
3
```
### 查找、替换操作
Collections类还提供了如下常用于查找、替换集合元素的方法
* int binarySearch(List list,Object key):使用二分查找法返回元素在集合中的位置索引，集合必须的是有序的
```java
List<Integer> list=new ArrayList<>();
list.add(3);
list.add(23);
list.add(100);

int index_23=Collections.binarySearch(list,100);
System.out.println("100的下表是"+index_23);

//运行结果
100的下表是2
```

* void max(List list):返回集合中最大的元素
* void min(List list):返回集合中最小的元素
* void max(List list,Comparator com)：根据提供的比较规则找出最大的元素
* void min(List list,Comparator com):根据提供的比较规则找出最小的元素
```java
List<Integer> list=new ArrayList<>();
list.add(3);
list.add(23);
list.add(100);
System.out.println("Max="+Collections.max(list));
System.out.println("Min="+Collections.min(list));
```
* void fill(List list,Object obj):使用指定的元素obj替换集合中的所有元素
```java
List<Integer> list=new ArrayList<>(10);
list.add(3);
list.add(23);
list.add(100);
Collections.fill(list,10);
list.forEach(x-> System.out.println(x));
//运行结果
10
10
10

```
* int frequency(List list,Object obj):计算指定元素在集合中的出现频率
```java
List<Integer> list=new ArrayList<>(10);
list.add(3);
list.add(23);
list.add(100);
list.add(100);
list.add(100);
list.add(100);

int f=Collections.frequency(list,100);
System.out.println(f);
//运行结果是
4

```
* int indexOfSubList(List source,List target):返回List对象在父List对象中第一次出现的位置，如果父List对象中不存在则返回-1;
```java
List<Integer> list=new ArrayList<>(10);
list.add(3);
list.add(23);
list.add(100);
list.add(100);
list.add(100);
list.add(100);

List<Integer> l=new ArrayList<>();
l.add(100);
l.add(100);
int index=Collections.indexOfSubList(list,l);
System.out.println(index);

```
* int indexOfLastSubList(List source,List target):返回子list在父list中出现的最后位置的索引，不存在返回-1
* boolean replaceAll(List list,Object oldVal,Object newVal):将集合中的所有的旧值换成新值
 ```java
List<Integer> list=new ArrayList<>(10);
list.add(3);
list.add(23);
list.add(100);
list.add(100);
list.add(100);
list.add(100);

Collections.replaceAll(list,100,50);
list.forEach(x-> System.out.println(x));

//运行结果
3
23
50
50
50
50
```

### 复制
* Collections类中的静态方法用于将指定的集合中所有的元素复制到另一个集合中。执行copy()


[参考文章](http://c.biancheng.net/view/6884.html)