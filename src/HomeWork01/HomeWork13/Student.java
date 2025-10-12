package HomeWork01.HomeWork13;

public class Student extends Person{
    private int Stu_id;

    public Student(int stu_id) {
        Stu_id = stu_id;
    }

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        Stu_id = stu_id;
    }

    public int getStu_id() {
        return Stu_id;
    }

    public void setStu_id(int stu_id) {
        Stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺会好好学习");
    }
    @Override
    public String Play() {
        return super.Play()+"足球";
    }

    @Override
    public String toString() {
        return "学生的信息:" +"\n"+
                "姓名:" + getName() +"\n"+
                "性别:" + getSex() +"\n"+
                "年龄:" + getAge() +"\n"+
                "学号:" + getStu_id();
    }
}
