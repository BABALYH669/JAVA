package HomeWork01.HomeWork13;

public class HomeWork13 {
    public static void main(String[] args) {
        Student student = new Student("jack",'男',18,22120106);
        Teacher teacher = new Teacher("marry",'女',32,12);
        System.out.println(teacher.toString());
        teacher.teach();
        System.out.println(teacher.Play());
        System.out.println(student.toString());
        student.study();
        System.out.println(student.Play());

    }
}
