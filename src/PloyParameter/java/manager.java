package PloyParameter.java;

public class manager extends Employee{
    double bonus;

    public void manage(){
        System.out.println("经理的管理方法");
    }

    public manager(double mouthlySalary, String name,double bonus) {
        super(mouthlySalary, name);
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    }
}
