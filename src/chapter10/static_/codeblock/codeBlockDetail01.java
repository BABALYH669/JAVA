package chapter10.static_.codeblock;

public class codeBlockDetail01 {
    public static void main(String[] args) {
        //1.创建对象实例时(new)
//        AA aa = new AA();
//        System.out.println("===================");
        //2.创建子类对象实例,父类也会被加载
//        AA aa01 = new AA();
//        System.out.println("===================");
        //3.使用类的静态成员(属性)时(静态属性,静态方法)
//        System.out.println(Cat.age);
//        System.out.println("===================");
        //普通代码块在创建对象实例时会被隐式调用,被创建一次就调用一次
        //只是使用类的静态成员,普通代码块不会被执行

        DD dd = new DD();
        DD dd1 = new DD();
        System.out.println(DD.n1);
    }
}
class DD{
    public static int n1 = 8888;
    //静态代码块
    static {
        System.out.println("DD 的静态代码块被执行");
    }
    //普通代码块
    {
        System.out.println("DD 的代码块被执行");
    }
}

class Cat{
    public static int age = 10;
    //静态代码块
    static {
        System.out.println("Cat 的静态代码块被执行");
    }
}

class BB{
    //静态代码块
    static {
        System.out.println("BB 的静态代码块被执行");
    }
}

class AA extends BB{
    //静态代码块
    static {
        System.out.println("AA 的静态代码块被执行");
    }
}