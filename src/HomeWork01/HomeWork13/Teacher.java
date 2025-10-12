package HomeWork01.HomeWork13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(int work_age) {
        this.work_age = work_age;
    }

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺会好好教学");
    }
    @Override
    public String Play() {
        return super.Play()+"象棋";
    }

    @Override
    public String toString() {
        return "老师的信息:" +"\n"+
                "姓名:" + getName() +"\n"+
                "性别:" + getSex() +"\n"+
                "年龄:" + getAge() +"\n"+
                "工龄:" + getWork_age();
    }
}
