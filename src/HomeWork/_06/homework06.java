package HomeWork._06;

public class homework06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();
        tang.passRiver();
        tang.passRiver();
        tang.common();
        tang.fly();
    }
}
/*
1.有一个交通工具接口类Vehicles，有work接口
2.有Horse类和Boat类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
5.实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
*/