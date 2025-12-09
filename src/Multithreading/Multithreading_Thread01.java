package Multithreading;

public class Multithreading_Thread01 {
    public static void main(String[] args) {
        thread01 thread01 = new thread01("线程A");
        thread01 thread02 = new thread01("线程B");
        thread01 thread03 = new thread01("线程C");
        thread01 thread04 = new thread01("线程D");
        //调用run方法不能直接启动多线程
        thread01.run();
        thread02.run();
        //应该调用start方法
        thread03.start();
        thread04.start();
    }
}

class thread01 extends Thread{
    public String name;
    public thread01(String name){
        this.name = name;
    }
    //想启动多线程必须要继承Thread类并且重写Thread中的run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行,"+"i="+i);
        }
    }
}