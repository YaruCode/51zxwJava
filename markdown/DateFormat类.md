# DateFormat类
*  DateFormat类提供了日期的格式化显示
```java
Date date=new Date();//实例化一个Date实例
DateFormat df= DateFormat.getDateInstance();//实例化一个formatter的工具类实例
String time=df.format(date);
System.out.println(time);
//运行结果
2022年2月13日


```
* 如果想要获取详细的日期时间信息
```java
Date date=new Date();//实例化一个Date实例
DateFormat df= DateFormat.getDateTimeInstance();
String time=df.format(date);
System.out.println(time);

//运行结果
2022年2月13日 下午8:45:10
```