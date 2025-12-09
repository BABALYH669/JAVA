package Multithreading;

public class Multithreading_sleep {
    public static void main(String[] args) {
        MyThread05 myThread05 = new MyThread05();
        Thread thread = new Thread(myThread05, "线程");
        thread.start();
    }
}
class MyThread05 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try{
                //延迟500ms再输出
                Thread.sleep(500);
            }catch (Exception e){}

            System.out.println(Thread.currentThread().getName()+"运行i = "+i);
        }
    }
}

