package HomeWork01.HomeWork04;

public class Manager extends Staff{
    private int bouns = 1000;

    public int getBouns() {
        return bouns;
    }

    public void setBouns(int bouns) {
        this.bouns = bouns;
    }

    @Override
    public void   PrintingWages(){
        System.out.println("这是重写的经理方法");
        System.out.println("名字"+ getName()+
                "工资"+(getSalary()*getDay()*1.2+getBouns()));
    }

    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }
}
