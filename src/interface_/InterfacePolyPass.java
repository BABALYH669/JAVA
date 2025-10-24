package interface_;

public class InterfacePolyPass {
    public static void main(String[] args) {
        // 接口类型的变量可以指向,实现了该接口的类的对象实例
        B_01 b01 = new C_01();
        //如果B_01继承了 A_01接口,而C_01 实现了B_01接口
        //那么,实际上就相当于 C_01接口也实现了A_01接口
        //这就是 接口多态传递现象
        A_01 a01 = new C_01();

    }
}
interface A_01{
    void Hi();
}
interface B_01 extends A_01{}

class C_01 implements B_01{
    @Override
    public void Hi() {

    }
}