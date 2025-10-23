package interface_;

public class Computer {
    //编写一个方法,计算机工作
    public void Work(USBInterface usbInterface){
        //通过接口调用方法
        usbInterface.Star();
        usbInterface.Stop();
    }
}
