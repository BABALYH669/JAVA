package Multithreading;

public class Multithreading_join {
    public static void main(String[] args) {
        MyThread04 myThread04 = new MyThread04();
        Thread thread = new Thread(myThread04,"线程");
        thread.start();
        for (int i = 0; i < 15; i++) {
            if(i>5){
                try{
                    //join()方法,强制执行线程,线程执行完毕之后在执行其他线程
                    thread.join();
                }catch (Exception e){

                }
            }
            System.out.println("main方法,i="+i);
        }

    }
}
class MyThread04 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"运行i = "+i);
        }
    }
}