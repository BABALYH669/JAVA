package final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        System.out.println(AA.num);
    }
}

class AA {
   public final static int num = 1000;
   static {
       System.out.println("静态代码块被加载");
   }
}
class BB {

}