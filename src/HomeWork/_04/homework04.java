package HomeWork._04;

public class homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },10,89);
    }
}
interface Computer{
    public double work(double n1,double n2);
}
class Cellphone {
    public void testWork(Computer computer,double n1,double n2){
        double result = computer.work(n1,n2);
        System.out.println("结果="+result);
    }
}
