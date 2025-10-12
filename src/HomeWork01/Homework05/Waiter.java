package HomeWork01.Homework05;

public class Waiter extends Employees{
    public Waiter() {
    }

    public Waiter(String name, double daySal, int day) {
        super(name, daySal, day);
    }

    @Override
    public void PrintingWages() {
        System.out.println("服务员方法");
        super.PrintingWages();
    }
}
