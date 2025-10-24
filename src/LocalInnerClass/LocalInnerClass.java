package LocalInnerClass;

import interface_.Interface01;

public class LocalInnerClass {//外部其他类
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.m1();
    }
}

class Outer01 {
    private int n1 = 100;

    private void outer01() {
        System.out.println("outer01方法");
    }

    public void m1() {
        //内部类定义的位置,方法内或代码块内
        //内部类可以也只能被final修饰
        final class Inner01 {
            private int n1 = 800;
            public void f1() {
                //局部内部类可以访问外部类的所有成员,包括私有的(private)
                System.out.println("n1=" +n1);//输出800,因为就近原则
                //如果外部类和局部内部类的成员重名时,默认遵循就近原则
                //如果想访问外部类的成员可以使用(外部类名.this.成员)
                //Outer01.this本质就是外部类的对象,哪个对象调用了m1,那么Outer01.this就指向哪个对象
                System.out.println("n1=" + Outer01.this.n1);//输出100
                //直接访问外部类Outer01的  outer01方法
                outer01();
            }

        }
        //外部类想使用内部类的方法需要在方法中,创建内部类的实例对象,然后调用方法
        Inner01 inner01 = new Inner01();
        inner01.f1();
    }
}