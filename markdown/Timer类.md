# Timer类
Timer类可以用于一些延时执行的操作

```java

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
        timer.schedule(task,3000);

        //可以指定时间来执行        
        timer.schedule(task,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-3-1 12:23:34"));
        //表示从现在开始两秒后执行,每一秒执行一次
        timer.schedule(task,2000,1000);

    }
}

```