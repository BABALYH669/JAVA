package HomeWork01.Homework05;

public class Employees {
    private String name;
    private double daySal;
    private int day;

    public void PrintingWages(){
        System.out.println("名字是"+getName()+"基本工资是"+getDay()*getDaySal());
    }

    public Employees() {

    }

    public Employees(String name, double daySal, int day) {
        this.name = name;
        this.daySal = daySal;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySal() {
        return daySal;
    }

    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
