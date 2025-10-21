package final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        First first = new First();
        System.out.println(first.calArea(2.3));

        Second second = new Second(2.3);
        System.out.println(second.calArea());

        Third third = new Third();
        System.out.println(third.calArea(2.3));

    }
}
//计算圆的面积,要求圆周率为3.14,赋值的三个位置都写

class First {
    //1.定义时声明
    public final double Pi = 3.14;
    public double radius;

    public double calArea(double radius) {
        return Pi * radius * radius;
    }
}

class Second {
    public double radius;
    public final double Pi;

    public Second(double radius) {
        this.radius = radius;
        Pi = 3.14;
    }

    public double calArea() {
        return Pi * radius * radius;
    }
}

class Third {
    public double radius;
    public final double Pi;

    {
        Pi = 3.14;
    }

    public double calArea(double radius) {
        return Pi * radius * radius;
    }
}
