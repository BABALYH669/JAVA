package Multithreading;

public class Multithreading_Stop {
    public static void main(String[] args) throws InterruptedException {
        MyThread11 myThread = new MyThread11();

        Thread thread = new Thread(myThread, "线程A");
        thread.start();

        // 让线程先运行一会儿
        Thread.sleep(100);  // 主线程睡 0.1 秒，让子线程有时间开始运行

        System.out.println("准备停止线程...");
        myThread.stopThread();  // 请求停止

        // 可选：等待线程真正结束
        thread.join();  // 主线程等待子线程结束
        System.out.println("线程已停止，程序结束。");
    }
}

class MyThread11 implements Runnable {
    // 挥发性变量，确保多线程可见性
    private volatile boolean running = true;

    public void stopThread() {
        this.running = false;  // 请求停止
    }

    @Override
    public void run() {
        int i = 0;
        while (running) {  // 不断检查 running 标志
            System.out.println(Thread.currentThread().getName() + " 运行, i=" + (i++));

            // 可选：加一点延迟，避免打印太快看不清
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;  // 被中断也可以退出
            }
        }

        System.out.println(Thread.currentThread().getName() + " 已停止。");
    }
}