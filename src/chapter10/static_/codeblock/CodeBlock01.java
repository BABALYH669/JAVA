package chapter10.static_.codeblock;

public class CodeBlock01 {
    public static void main(String[] args) {
        school school01 = new school("Jack");
        System.out.println("=====================");
        school school02 = new school("smitch", "marry");
        System.out.println("=====================");
        school school03 = new school("bro", "jam", 1000);
    }
}
class school{
    private String teacher;
    private String student;
    private int number;
    {
        System.out.println("老师上班了");
        System.out.println("学生上学了");
        System.out.println("一共1000人");
    }
    public school(String teacher) {
        System.out.println("school(String teacher)被执行");
        this.teacher = teacher;
    }

    public school(String teacher, String student) {
        System.out.println("school(String teacher, String student)被执行");
        this.teacher = teacher;
        this.student = student;
    }

    public school(String teacher, String student, int number) {
        System.out.println("school(String teacher, String student, int number)被执行");
        this.teacher = teacher;
        this.student = student;
        this.number = number;
    }
}
