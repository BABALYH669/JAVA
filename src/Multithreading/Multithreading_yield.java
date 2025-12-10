package Multithreading;

public class Multithreading_yield {
    public static void main(String[] args) {
        MyThread09 myThread01 = new MyThread09();
        MyThread09 myThread02 = new MyThread09();
        Thread thread01 = new Thread(myThread01,"线程A");
        Thread thread02 = new Thread(myThread02,"线程B");
        thread01.start();
        thread02.start();
    }
}
class MyThread09 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"运行i = "+i);
            if(i == 3){
                System.out.println("线程礼让");
                Thread.currentThread().yield();
            }
        }
    }
}