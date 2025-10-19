package chapter10.static_;

public class main01 {
    //静态变量
    private static String name1="知离夜里叶离枝";
    //静态方法
    private static void Hello(){
        System.out.println("Hello");
    }

    //非静态变量
    private String name2="BABALYH669";
    //非静态方法
    private void Hi(){
        System.out.println("Hi");
    }
    public static void main(String[] args){
        //1.静态方法main 可以调用本类的静态方法和静态变量
        System.out.println("name="+name1);
        Hello();
        //2.静态方法main不能直接调用本类的非静态方法和非静态变量
//        System.out.println("name="+name2);
//        Hi();
        //3.静态方法main想调用本类的非静态方法和非静态变量需要创建对象调用
        main01 main01 = new main01();
        System.out.println("name="+main01.name2);
        main01.Hi();
    }
}
