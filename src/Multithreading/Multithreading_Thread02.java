package Multithreading;

public class Multithreading_Thread02 {
    public static void main(String[] args) {
        threadDemo01 threadDemo01 = new threadDemo01();
        threadDemo01 threadDemo02 = new threadDemo01();
        threadDemo01 threadDemo03 = new threadDemo01();
        threadDemo01.start();
        threadDemo02.start();
        threadDemo03.start();
    }
}

class threadDemo01 extends Thread {
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (ticket >0) {
                System.out.println("售出,ticket=" + ticket--);
            }
        }
    }
}
