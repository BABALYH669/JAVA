package Wrapper;

public class WrapperVSString01 {
    public static void main(String[] args) {
        //Integer转换成String类型
        Integer n1 = 100;
        //方法一直接加个字符串就自动转型成String类型了
        String s1 = n1+"";
        //方法二,使用toString()方法
        String s2 = n1.toString();
        //方法三,使用String类的ValuerOf()方法
        String s3 = String.valueOf(n1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //String类型转换成Integer类型
        String s4 = "123456";
        //方法一使用Integer类的parseInt方法
        Integer n2 = Integer.parseInt(s4);
        //方法二,使用Integer方法的构造器
        Integer n3 = new Integer(s4);

        System.out.println(n2+","+n3);
    }
}
