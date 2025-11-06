package HomeWork._05;

public class homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.Test();
    }
}

class A{
    private String name = "小明";
    public void Test(){
        class B{
            private final String name = "小红";
            public void B_test(){
                B b = new B();
                System.out.println(b.name);
                System.out.println(A.this.name);
            }

        }
        B b = new B();
        b.B_test();
    }

}