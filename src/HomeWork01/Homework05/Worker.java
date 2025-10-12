package HomeWork01.Homework05;

public class Worker extends Employees{
    public Worker(String name, double daySal, int day) {
        super(name, daySal, day);
    }

    public Worker() {
    }

    @Override
    public void PrintingWages() {
        System.out.println("工人方法");
        super.PrintingWages();
    }
}
