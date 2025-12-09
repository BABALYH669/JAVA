package Multithreading;

public class Multithreading_setDaemon {
    public static void main(String[] args) {
        MyThread07 myThread07 = new MyThread07();
        Thread thread = new Thread(myThread07,"线程A");
        thread.setDaemon(true);
        thread.start();

        // 主线程只活2秒就结束
        try{
            Thread.sleep(2000);
        }catch (Exception e){}

        System.out.println("========== 主线程要退出了 ==========");
        // main结束 → 整个JVM进程是否立刻停止？
        //是的,主线程结束后 守护进程直接结束
    }
}

class MyThread07 implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"正在运行");
        }
    }
}
