package HomeWork01.HomeWork04;

public class employees extends Staff{
    public employees(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void PrintingWages() {
        System.out.println("这是重写的员工方法");
        //复用父类方法
        super.PrintingWages();
    }
}
