package HomeWork._06;
//有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
//实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
public class Person {
    private String name;
    //调用的是接口
    private Vehicles vehicles;
    //构造器
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        //直接通过类名.方法 调用 船方法
//        Boat boat = VehiclesFactory.getBoat();
        //调用Boat类重写接口的work方法
//        boat.work();
        //判断vehicles的类型是不是Boat类型
        //如果是Boat类型返回true 但是有取反所以是 false 因为是false所以if语句不会执行
        //如果是Horse类型返回false 但是有取反所以是 true 因为是true所以if语句会执行
        //如果是null类型返回false 但是有取反所以是 true 因为是true所以if语句会执行
        if(!(vehicles instanceof Boat)){
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }


    public void common(){
        //这种方法会导致对象创建的时候传入的数值被浪费
        //所以要判断一下是否有对象
//        Horse horse = VehiclesFactory.getHorse();
//        horse.work();

//        if(vehicles == null){
//            //直接用接口接收,因为判断vehicles是null
//            vehicles = VehiclesFactory.getHorse();
//        }
//        vehicles.work();

        if(!(vehicles instanceof Horse)){
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();

    }

    public void fly(){
        if(!(vehicles instanceof Airplane)){
            vehicles = VehiclesFactory.getAirplane();
        }
        vehicles.work();
    }
}
