package HomeWork01.HomeWork04;

public class Staff {
    private String name;
    private double salary;
    private int day;

    public void PrintingWages(){
        System.out.println("名字"+ name+"工资"+salary*day);
    }

    public Staff(){
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public Staff(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
