package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Multithreading_Dome01 {
    //这个地方不要忘记Throws 不然utureTask get方法会报编程错误
    public static void main(String[] args) throws Exception{
        //创建两个线程
        MyThread mt01 = new MyThread();
        MyThread mt02 = new MyThread();
        //使用FutureTask泛型来接收结果
        FutureTask<String> task1 = new FutureTask<String>(mt01);
        FutureTask<String> task2 = new FutureTask<String>(mt02);
        //FutureTask是继承Runnable,所以需要包装成Thread,才能使用start方法
        new Thread(task1).start();
        new Thread(task2).start();
        //FutureTask get方法是用来接收结果的
        System.out.println("线程A的返回结果"+task1.get());
        System.out.println("线程B的返回结果"+task2.get());
    }
}
//继承接口Callable,这个是jdk专门为了获取线程而创建的接口
class MyThread implements Callable<String> {
    private int ticket = 5;
    //重写Callable接口中的call()方法
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0) {
                System.out.println("售出,ticket=" + ticket--);
            }
        }
        return "票已卖光";
    }
}
