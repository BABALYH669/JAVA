package HomeWork01.Homework05;

public class Peasant extends Employees{
    public Peasant() {
    }

    public Peasant(String name, double daySal, int day) {
        super(name, daySal, day);
    }

    @Override
    public void PrintingWages() {
        System.out.println("农民方法");
        super.PrintingWages();
    }
}
