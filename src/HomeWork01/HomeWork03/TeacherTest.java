package HomeWork01.HomeWork03;

public class TeacherTest extends Teacher{
    public static void main(String[] args) {
        Profession profession = new Profession("jack",65,"高级",10000);
        System.out.println(profession.introduce());
    }
}
