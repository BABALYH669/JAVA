package chapter10.static_.codeblock;

public class codeBlockDetail04 {
    public static void main(String[] args) {
        CCCC cccc = new CCCC();
    }
}
class AAAA{
    //静态属性初始化
    private static int n1=getN1();
    //静态代码块
    static {
        System.out.println("AAAA静态代码块被执行");
    }
    public static int getN1(){
        System.out.println("AAAA静态成员被执行");
        return 100;
    }

    //普通属性初始化
    private int n2=getN2();
    //普通代码块
    {
        System.out.println("AAAA普通代码块被执行");
    }

    public int getN2(){
        System.out.println("AAAA普通成员被执行");
        return 100;
    }
    public AAAA(){
        System.out.println("AAAA构造器被执行了");
    }

}
class BBBB extends AAAA {
    //静态属性初始化
    private static int n3=getN3();
    //静态代码块
    static {
        System.out.println("BBBB静态代码块被执行");
    }
    public static int getN3(){
        System.out.println("BBBB静态成员被执行");
        return 100;
    }

    //普通属性初始化
    private int n4=getN4();
    //普通代码块
    {
        System.out.println("BBBB普通代码块被执行");
    }

    public int getN4(){
        System.out.println("BBBB普通成员被执行");
        return 100;
    }
    public BBBB(){
        System.out.println("BBBB构造器被执行了");
    }
}
class CCCC extends BBBB {
    //静态属性初始化
    private static int n5=getN5();
    //静态代码块
    static {
        System.out.println("CCCC静态代码块被执行");
    }
    public static int getN5(){
        System.out.println("CCCC静态成员被执行");
        return 100;
    }

    //普通属性初始化
    private int n6=getN6();
    //普通代码块
    {
        System.out.println("CCCC普通代码块被执行");
    }

    public int getN6(){
        System.out.println("CCCC普通成员被执行");
        return 100;
    }
    public CCCC(){
        System.out.println("CCCC构造器被执行了");
    }
}