package interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //接口数组可以存储已经实现接口内方法的类
        USB_[] usb01 = new USB_[2];
        usb01[0] = new Phone_();
        usb01[1] = new Camera_();

        //便利
        for (int i = 0; i < usb01.length; i++) {
            usb01[i].Work();
            //需要实现Phone独有的call方法,这里应该是向下转型,用到的关键字是instanceof
            //instanceof是判断运行类型的
            if(usb01[i] instanceof Phone_){
                ((Phone_) usb01[i]).Call();
            }
        }


    }
}

interface USB_{
    void Work();
}

class Phone_ implements USB_{
    @Override
    public void Work() {
        System.out.println("手机在工作");
    }

    public void Call(){
        System.out.println("手机的call方法");
    }
}

class Camera_ implements USB_{
    @Override
    public void Work() {
        System.out.println("相机在工作");
    }
}