package Exception;

import java.util.Scanner;

public class TryCatch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number01 = 0;
        while (true) {
            try {
                System.out.println("请输入一个整数");
                String Number = sc.nextLine();
                Number01 = Integer.parseInt(Number);
                break;
            } catch (Exception e) {
                System.out.println("输入的不是一个整数");

            }

        }
        System.out.println("你输入的值是:"+Number01);
    }
}
