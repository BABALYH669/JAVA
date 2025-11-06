package HomeWork._06;
//创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
public class VehiclesFactory {

    //获得horse对象实例,添加static可以不用创建对象 直接类名.方法调用
    public static Horse getHorse(){
        return new Horse();
    }
    //获得boat对象实例
    public static Boat getBoat(){
        return new Boat();
    }
    //获得airplane
    public static Airplane getAirplane(){
        return new Airplane();
    }
}
