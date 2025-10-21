package abstract_;

public class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, String id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("经理"+getName()+"工作中...");
    }
}
