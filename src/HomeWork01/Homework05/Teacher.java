package HomeWork01.Homework05;

public class Teacher extends Employees{
    private double tuitionFee;

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public Teacher(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public Teacher(String name, double daySal, int day, double tuitionFee) {
        super(name, daySal, day);
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void PrintingWages() {
        System.out.println("教师方法");
        System.out.println("名字是"+getName()+
                "基本工资是"+getDay()*getDaySal()+
                "课酬是"+getTuitionFee()*getDay());
    }

}
