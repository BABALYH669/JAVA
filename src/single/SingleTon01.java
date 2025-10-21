package single;

public class SingleTon01 {
    public static void main(String[] args) {
        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
        //instance和instance1是同一个对象,返回true
        System.out.println(instance == instance1);
    }
}

class GirlFriend {
    //饿汉式单例
    //私有成员变量
    private String GirlFriendName;

    //为了确保只创建一个对象
    //在类的内部创建一个对象
    //设置static是为了让公共方法getInstance访问到gf对象
    private static GirlFriend gf = new GirlFriend("小楠");

    //私有化构造器
    private GirlFriend(String girlFriendName) {
        this.GirlFriendName = girlFriendName;
    }

    //提供一个公共(public)的static方法,返回gf对象
    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "GirlFriendName='" + GirlFriendName + '\'' +
                '}';
    }
}