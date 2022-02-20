# java中遍历map的方式
Map集合的遍历与List和Set不同。Map有两组值，因此遍历时可以只遍历其中的一组，也可以同时遍历。Map以及实现Map接口的接口类(如HashMap,TreeMap
,LinkedHashMap,HashTable等)都可以用以下几种遍历方式来遍历

* 在for循环中使用entry是实现遍历(最常见和最常用的遍历方式)
```java
     Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(26,"z");
        map.put(3,"c");
        map.put(5,"e");

        for(Map.Entry<Integer,String> entry:map.entrySet())
        {
            System.out.println("key="+entry.getKey()+"\t"+"value="+entry.getValue());
        }
        
```

* 使用for-each遍历keys或者values,一般适用于只需要map中的key或者value时使用。性能比entrySet较好
```java
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"a");
        map.put(26,"z");
        map.put(3,"c");
        map.put(5,"e");

        for(String str:map.values())
        {
            System.out.println(str);
        }
```

* 使用迭代器访问
```java
Map<Integer,String> map=new HashMap<>();
map.put(1,"a");
map.put(26,"z");
map.put(3,"c");
map.put(5,"e");

Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
while(iterator.hasNext())
{
    Map.Entry<Integer,String> entry=iterator.next();
    System.out.println("key="+entry.getKey()+"\t"+"value="+entry.getValue());
}
```
* 通过键值遍历，这种方式效率比较低，因为本身从键取值是耗时操作
```java
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
```
[参考文章](http://c.biancheng.net/view/6872.html)