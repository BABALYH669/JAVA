package LocalInnerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {//匿名内部类,
            @Override
            public void ring() {
                System.out.println("起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("哈哈哈哈哈");
            }
        });

    }
}

interface Bell {
    //铃声接口
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        bell.ring();
        //动态绑定,又回到实际的运行类型
        // 运行类型是InnerClassExercise01$1,匿名内部类
        //调用了匿名内部类的ring()方法
    }

}
