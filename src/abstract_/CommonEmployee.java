package abstract_;

public class CommonEmployee extends Employee{

    public CommonEmployee(String name, double salary, String id) {
        super(name, salary, id);
    }

    @Override
    public void work() {
        System.out.println("员工"+getName()+"工作中...");
    }
}
