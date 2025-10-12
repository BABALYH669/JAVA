package recursion;

import java.util.Scanner;

public class recursion02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1~10天");
        Peach peach = new Peach();
        int day = scanner.nextInt();
        System.out.println("day="+day+"有"+peach.peach(day)+"个桃子");
    }
}

class Peach {
    public int peach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (peach(day + 1) + 1) * 2;
        } else {
            System.out.println("请输入1~10天");
            return -1;
        }
    }
}