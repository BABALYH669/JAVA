package Multithreading;

public class Multithreading_priority {
    public static void main(String[] args) {
        MyThread08 myThread01 = new MyThread08();
        MyThread08 myThread02 = new MyThread08();
        MyThread08 myThread03 = new MyThread08();
        Thread thread01 = new Thread(myThread01,"线程A");
        Thread thread02 = new Thread(myThread02,"线程B");
        Thread thread03 = new Thread(myThread03,"线程C");
        thread01.setPriority(Thread.MAX_PRIORITY);//优先级最高
        thread02.setPriority(Thread.NORM_PRIORITY);//优先级中等
        thread03.setPriority(Thread.MIN_PRIORITY);//优先级最低
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
class MyThread08 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+"运行i = "+i);
        }
    }
}
//Java 线程优先级只是一个“建议”，在现代操作系统（尤其是 Linux）上基本没用，不能用来控制执行顺序。
//它唯一的实际作用是：在高负载场景下，让重要线程“大概率”获得更多 CPU 时间，提高响应速度。