package chapter10.static_;

public class StaticMethod {
    public static void main(String[] args) {
        //创建两个学生对象
        //通过对象名调用
        Stu tom = new Stu("tom");
        tom.payFee(100);
        Stu marry = new Stu("marry");
        marry.payFee(200);

        //输入总学费
        //通过类名调用
        Stu.showFee();

    }
}

class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //static修饰就是静态方法
    //静态方法可以访问静态变量
    public static void payFee(double fee) {
        Stu.fee += fee; //形参累计到静态变量
    }

    public static void showFee() {
        System.out.println("总学费" + Stu.fee);
    }
}
