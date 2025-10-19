package chapter10.static_.codeblock;

public class codeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();

    }
}
class A {
    private static int n1=getN1();
    //静态代码块
    static {
        System.out.println("静态代码块被执行");
    }
    public static int getN1(){
        System.out.println("静态成员被执行");
        return 100;
    }

    private int n3=getN3();

    //普通代码块
    {
        System.out.println("普通代码块被执行");
    }

    public int getN3(){
        System.out.println("普通成员被执行");
        return 100;
    }

    public A() {
        System.out.println("构造器被执行了");
    }
}
