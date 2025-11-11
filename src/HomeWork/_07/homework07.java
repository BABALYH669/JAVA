package HomeWork._07;

import java.util.Scanner;

public class homework07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入当前车内温度");
        Car car = new Car(scanner.nextInt());
        Car.Air air = car.new Air();
        air.flow();

    }
}

class Car {
    private int temperature;

    public Car(int temperature) {
        this.temperature = temperature;
    }

    class Air {//成员内部类
        public void flow() {
            if (temperature >= 40) {
                System.out.println("吹冷风");
            } else if (temperature <= 0) {
                System.out.println("吹暖风");
            }
            if (temperature < 40 && temperature > 0) {
                System.out.println("空调关闭");
            }
        }
    }
}
