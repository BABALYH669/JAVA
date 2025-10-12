package PloyParameter.java;

public class Employee {
    private String name;
    private double mouthlySalary;

    public double getAnnual() {
        double Annual = mouthlySalary * 12;
        return Annual;
    }

    public Employee(double mouthlySalary, String name) {
        this.mouthlySalary = mouthlySalary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMouthlySalary() {
        return mouthlySalary;
    }

    public void setMouthlySalary(double mouthlySalary) {
        this.mouthlySalary = mouthlySalary;
    }

}
