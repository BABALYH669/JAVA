package HomeWork01.HomeWork10;

public class HomeWork10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack", 18, "医生", "男", 5000);
        Doctor doctor2 = new Doctor("jack", 18, "医生", "男", 5000);
        System.out.println(doctor1.equals(doctor2));
    }
}
