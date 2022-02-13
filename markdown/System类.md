# System类
System类是不能实例化的，看到源码中没有提供构造方法，而且所有的方法都是表明是静态方法

###### java中的native关键字
简单讲，一个native方法就是一个java程序调用非java代码的接口。一个Native Method是这样一个java方法：该方法实现由非java语言实现，比如C语言。
更具体的用法可以看下面的博客
https://blog.csdn.net/jiakw_1981/article/details/3073613

###### System中的exit()方法
System.exit()方法是实现程序强制退出的功能,不管代码运行到什么地方，遇到这行代码，程序会终止运行

###### Syste.getCurrentTimeMillis()获取当前的系统时间与1970-1-1午夜时间的差，用毫秒表示
当程序中需要计算方法运行的时间，或者需要比较算法效率时可以获取两次系统时间做差的方式比较运行时间
```java
long now=System.currentTimeMillis();
Thread.sleep(1000);
long now1=System.currentTimeMillis();
int a=100;
System.out.println(now1-now);
```

