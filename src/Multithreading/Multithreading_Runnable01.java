package Multithreading;

public class Multithreading_Runnable01 {
    public static void main(String[] args) {
        // 创建两个实现了Runnable接口的任务对象
        thread02 thread01 = new thread02("线程A");
        thread02 thread02 = new thread02("线程B");

        // 把Runnable任务对象包装成Thread对象
        // 只有Thread对象才能真正代表一个线程并调用start()启动
        Thread run01 = new Thread(thread01);  // 这里可以顺便给线程起个名字，更清晰
        Thread run02 = new Thread(thread02);

        // 或者更推荐的写法（顺便给线程命名）：
        // Thread run01 = new Thread(thread01, "线程A");
        // Thread run02 = new Thread(thread02, "线程B");

        // 调用start()才会真正创建并启动新线程，执行run()方法
        run01.start();
        run02.start();
    }
}

class thread02 implements Runnable{
    public String name;
    public thread02(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行,"+"i="+i);
        }
    }
}