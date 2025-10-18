package chapter10.static_;

import HomeWork01.HomeWork03.Profession;

public class ChildGame {
    public static void main(String[] args){
        //类名.静态变量
        Child.number++;
        //对象.类变量
        Child child = new Child();
        child.number++;
        System.out.println(Child.number);//2
    }
}
class Child{//类
    public static int number;

}


