package Generics;

public class Generics_Demo01 {
    public static void main(String[] args) {
        Point<Integer> p01 = new Point<Integer>();
        p01.setVar(15);
        System.out.println(p01.getVar()*10);
        //其中有个自动拆箱的过程
        Point<String> p02 = new Point<String>();
        p02.setVar("Hello World");
        System.out.println(p02.getVar().length());

        Point<Double> p03 = new Point<Double>();
        //必须是引用类型不能是基本数据类型
        p03.setVar(15.86);
        System.out.println(p03.getVar()*10.68);
    }
}
class Point<T>{
    private T var;

    public T getVar() {
        return var;
    }

    public void setVar(T var) {
        this.var = var;
    }
}