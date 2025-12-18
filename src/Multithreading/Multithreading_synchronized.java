package Multithreading;

public class Multithreading_synchronized {
    public static void main(String[] args) {
        MyThread10 myThread10 = new MyThread10();
        Thread thread01 = new Thread(myThread10,"线程A");
        Thread thread02 = new Thread(myThread10,"线程B");
        Thread thread03 = new Thread(myThread10,"线程C");
        thread01.start();
        thread02.start();
        thread03.start();
    }
}

class MyThread10 implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {     //超出票数的循环
            synchronized (this) {               //设置需要同步的操作
                if (ticket > 0) {               //判断是否有剩余票
                    try {
                        Thread.sleep(300);  //加入延迟
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("卖票：ticket = " + ticket--);
                }
            }
        }
    }
}