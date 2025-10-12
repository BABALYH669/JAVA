package PloyParameter.java;

public class ordinaryEmployee extends Employee{
    public void work(){
        System.out.println("员工的工作方法"+getName());
    }

    public ordinaryEmployee(double mouthlySalary, String name) {
        super(mouthlySalary, name);
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
