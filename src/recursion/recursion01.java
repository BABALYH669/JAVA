package recursion;

import java.util.Scanner;

public class recursion01 {
    public static void main(String[] args) {
        //斐波那契數列 1,1,2,3,5,8,13,21每一个数是前面两个数的和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的数值");
        int n = scanner.nextInt();
        Fibonacci01 fibonacci01 = new Fibonacci01();
        System.out.println("n=" + n +"对应的斐波那契数列为"+fibonacci01.Fibonacci(n));
    }

}

class Fibonacci01 {
    public int Fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return Fibonacci(n - 1) + Fibonacci((n - 2));
            }
        } else {
            System.out.println("请输入大于1的整数");
            return -1;
        }
    }
}
