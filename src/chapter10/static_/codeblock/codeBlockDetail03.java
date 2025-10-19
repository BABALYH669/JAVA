package chapter10.static_.codeblock;

public class codeBlockDetail03 {
    public static void main(String[] args) {
        BBB bbb = new BBB();
    }
}

class AAA{

    public AAA(){
        //隐藏了super();AAA的super()是Object Object中没有参数
        //调用本类的普通代码块,没有
        System.out.println("AAA构造器被执行了");
    }

}

class BBB extends AAA{
    //普通代码块
    {
        System.out.println("BBB普通代码块被执行了");
    }
    public BBB() {
        //隐藏了super();
        //调用本类的普通代码块
        System.out.println("BBB构造器被执行了");
    }
}
