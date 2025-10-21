package single;

public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);

        System.out.println(instance == instance1);
    }
}

class Cat{
    private String name;
    //静态属性对象
    private static Cat cat;
    //构造器
    private Cat(String name) {
        this.name = name;
    }
    //创建Cat对象的实例
    //只有当用户使用getInstance()方法时才创建对象
    //调用两次会返回同一个对象
    public static Cat getInstance(){
        if(cat == null){
            cat = new Cat("Bro");
        }
        //第二次创建也返回同一个对象
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}