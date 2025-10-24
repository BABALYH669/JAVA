package LocalInnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

interface IA {//接口

    public void cry();
}

class Outer04 { //外部类
    private int n1 = 10;//属性

    public void method() {//方法
        //匿名内部类只能使用一次
        //基于接口的匿名内部类
        //编译类型是IA  运行类型是Outer04$1
        /*
         * class Outer04$1 implements IA{
         * }
         * */
        IA tiger = new IA() {//匿名内部类
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        //tiger的运行类型==>LocalInnerClass.Outer04$1
        System.out.println("tiger的运行类型=" + tiger.getClass());
        //匿名内部类的方法可以多次调用
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //基于类的匿名内部类
        //编译类型是Father,运行类型是 Outer04$2
        // 因为加了一个大括号就变成了匿名内部类,没有大括号编译类型是Father
        /*
         * class Outer04$2 extends Father{
         * }
         * */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("重写了father的test方法");
            }
        };
        father.test();

        //基于抽象方法的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };

        animal.eat();
    }
}


class Father {
    public Father(String name) {
        //构造器

    }

    public void test() {
        //方法
    }
}

abstract class Animal{
    abstract void eat();
}