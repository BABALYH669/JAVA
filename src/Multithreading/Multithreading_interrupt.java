package Multithreading;

public class Multithreading_interrupt {
    public static void main(String[] args) {
        MyThread06 myThread06 = new MyThread06();
        Thread thread = new Thread(myThread06, "线程");
        thread.start();
        try {
            //线程休眠500ms
            Thread.sleep(500);
        } catch (Exception e) {

        }
        //interrupt 线程终止方法
        thread.interrupt();
    }
}

class MyThread06 implements Runnable {
    @Override
    public void run() {
        System.out.println("1.进入run方法");
        try {
            //线程休眠1000ms
            //因为主方法里休眠500ms就直接中断进程
            //所以会报错直接进入到catch里
            Thread.sleep(1000);
            System.out.println("2.run开始休眠");
        } catch (Exception e) {
            System.out.println("3.休眠以终止");
            //返回调用处
            //不会执行34行代码
            return;
        }
        System.out.println("4.run方法正常结束");
    }
}