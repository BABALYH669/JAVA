package Multithreading;

public class Multithreading_isAlive {
    public static void main(String[] args) {
        MyThread03 myThread03 = new MyThread03();
        Thread t  = new Thread(myThread03,"线程");
        //.isAlive()判断线程是否启动 启动输出true,未启动输出false
        System.out.println("线程启动之前--->"+t.isAlive());
        t.start();
        System.out.println("线程启动之后--->"+t.isAlive());
        for (int i = 0; i < 3; i++) {
            System.out.println("main运行--->"+i);
        }
        System.out.println("线程启动之后--->"+t.isAlive()) ;
    }
}
class MyThread03 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"运行i = "+i);
        }
    }
}