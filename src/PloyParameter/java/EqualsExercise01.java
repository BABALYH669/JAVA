package PloyParameter.java;

import java.util.Objects;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 18, '男');
        Person p2 = new Person("jack", 18, '男');

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

}

class Person {
    private String name;
    private int age;
    private char gender;

    @Override
    public boolean equals(Object obj){
        //这个this 指的是 Person这个类
        //判断这个传入的obj是不是属于Person类的
        // 如果是同一个对象直接返回true,同一个对象不需要判断了
        if(this == obj){
            return true;
        }
        //instanceof 比较操作符 判断是否是子类的
        if(obj instanceof Person){
            //向下转型 目的是为了获取储存的内容
            Person p = (Person) obj;
            //System.out.println(p1.equals(p2));
            //其中这个this指的是p1的属性，p指的是p2的属性
            return this.name.equals(p.name) && this.age == p.age && this.gender== p.gender;
        }
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}