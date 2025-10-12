package HomeWork01.HomeWork03;

public class lecturer extends Teacher{
    private double salary;

    public lecturer(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    public String introduce(){
        return "Teacher{" +
                "名字是'" + super.getName() + '\'' +
                ", 年龄是" + super.getAge() +
                ", 职称是讲师"  + '\'' +
                ", 工资为" + this.getSalary()*1.1 +
                '}';
    }
}
