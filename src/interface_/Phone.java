package interface_;

public class Phone implements USBInterface{
    //重写接口的两个方法

    @Override
    public void Star() {
        System.out.println("手机开始工作...");
    }

    @Override
    public void Stop() {
        System.out.println("手机停止工作...");
    }
}
