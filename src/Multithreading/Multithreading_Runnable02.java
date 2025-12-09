package Multithreading;

public class Multithreading_Runnable02 {
    public static void main(String[] args) {
        runnable02 runnable02 = new runnable02();
        new Thread(runnable02).start();
        new Thread(runnable02).start();
        new Thread(runnable02).start();
    }
}

class runnable02 implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (ticket > 0) {
                System.out.println("售出,ticket=" + ticket--);
            }
        }
    }
}