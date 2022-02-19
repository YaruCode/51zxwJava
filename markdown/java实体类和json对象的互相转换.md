# java实体类和json对象的互相转换

###### java对象转换为json对象
定义Person对象
```java
package pojo;

public class Person {

    private String name;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private int id;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

//把person对象转化为json字符串
    public String convertToJson() throws JsonProcessingException {
        Person person=new Person("mikle",19);
        ObjectMapper mapper=new ObjectMapper();
        String str=mapper.writeValueAsString(person);
        return str;
    }

//运行结果
{"name":"mikle","id":19}



```