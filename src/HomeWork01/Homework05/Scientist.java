package HomeWork01.Homework05;

public class Scientist extends Employees{
    private double yearEndBonus;

    public Scientist(double yearEndBonus) {
        this.yearEndBonus = yearEndBonus;
    }

    public Scientist(String name, double daySal, int day, double yearEndBonus) {
        super(name, daySal, day);
        this.yearEndBonus = yearEndBonus;
    }

    public double getYearEndBonus() {
        return yearEndBonus;
    }

    public void setYearEndBonus(double yearEndBonus) {
        this.yearEndBonus = yearEndBonus;
    }

    @Override
    public void PrintingWages() {
        System.out.println("科学家方法");
        System.out.println("名字是"+getName()+
                "基本工资是"+getDay()*getDaySal()+
                "年终奖是"+getYearEndBonus());
    }
}
