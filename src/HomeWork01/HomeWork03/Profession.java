package HomeWork01.HomeWork03;

public class Profession extends Teacher {

    public Profession(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }


    public String introduce(){
        return "Teacher{" +
                "名字是'" + super.getName() + '\'' +
                ", 年龄是" + super.getAge() +
                ", 职称是教授"+ '\'' +
                ", 工资为" + super.getSalary()*1.3 +
                '}';
    }
}
