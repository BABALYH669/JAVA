package HomeWork._09;

import java.util.Scanner;

public class EcmDef {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被除数");
        n1 = scanner.nextInt();
        System.out.println("请输入除数");
        n2 = scanner.nextInt();
        System.out.println(new EcmDef().cal(n1,n2));

    }
    public int cal(int n1,int n2){
        if(n2 == 0){
            throw new divideException ("除数不能为零");
        }
        return n1/n2;
    }
}

class divideException  extends RuntimeException{
    public divideException (String message){
        super(message);
    }

}

