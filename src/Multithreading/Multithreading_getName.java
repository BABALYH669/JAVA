package Multithreading;

public class Multithreading_getName {
    public static void main(String[] args) {
        MyThread02 myThread02 = new MyThread02();
        //自动命名线程,明明格式为Thread-X X从0开始
        new Thread(myThread02).start();
        new Thread(myThread02).start();
        new Thread(myThread02).start();
        //自定义线程名字
        new Thread(myThread02,"线程A").start();
        new Thread(myThread02,"线程B").start();
    }
}
//Thread.currentThread().getName()方法
class MyThread02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            //Thread.currentThread().getName()方法为  获取正在运行的线程的名称
            System.out.println(Thread.currentThread().getName()+"运行i = "+i);
        }
    }
}