package LocalInnerClass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        //在外部其他类调用成员内部类
        //第一种方式
        OuterA outerA = new OuterA();
        OuterA.InnerA innerA = outerA.new InnerA();
        innerA.Say();
        //第二种方式,在外部类编写一个方式返回成员内部类
        OuterA.InnerA innerA1 = outerA.getInnerA();
        innerA1.Say();
        //第三种方式是第一种的简写
        OuterA.InnerA innerA2 = new OuterA().new InnerA();
        innerA2.Say();
    }
}

class OuterA {
    private int n1 = 100;
    private String name = "小明";

    class InnerA {
        public void Say() {
            System.out.println("n1 = " + n1 + "name = " + name);
        }
    }
    //方法内要创建一个成员内部类的对象
    public InnerA getInnerA(){
        return new InnerA();
    }
}
