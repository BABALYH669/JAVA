package SmallChangeSys;

import java.text.SimpleDateFormat;//转换中国年月日格式
import java.util.Date;//获取日期
import java.util.Scanner;//键盘录入
import java.util.SimpleTimeZone;

public class SmallChangeSys01 {
    public static double money;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = "";//目的是跳转语句
        boolean loop = true;//which 的循环条件
        String details = "\n----------------零钱通明细-----------------";
        double money = 0;//记录金额
        double balance = 0;//记录余额
        Date date = null;//获取日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//更改日期格式
        do {
            System.out.println("----------------零钱通菜单-----------------");
            System.out.println("               1  零钱通明细");
            System.out.println("               2  收益入帐");
            System.out.println("               3  消费");
            System.out.println("               4  退出");

            System.out.println("请选择（1~4）");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入帐金额");
                    money = scanner.nextDouble();
                    //判断输入金额是否合规
                    if (money <= 0) {
                        System.out.println("输入的金额不能小于等于0");
                        break;
                    }
                    //记录余额
                    balance += money;
                    date = new Date();
                    //  +=  ！！！！
                    details += "\n 收益入账金额\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("输入消费金额");
                    //消费金额变量
                    String note = "";
                    money = scanner.nextDouble();
                    balance -= money;
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应在0~" + balance);
                        break;
                    }
                    date = new Date();
                    System.out.println("输入消费项目");
                    //获取消费金额
                    note = scanner.next();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    String choice = "";
                    //判断是否输入y/n
                    //拆分思想，每段代码实现一个小功能
                    //降低耦合性
                    //提高代码阅读性和维护性
                    while (true) {
                        System.out.println("是要退出嘛？请输入y/n");
                        choice = scanner.next();
                        //equals 判断内容方法
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if ("y".equals(choice)) {
                        loop = false;
                    }
                    break;
                //都不符合caus 的 进入这个语句
                default:
                    System.out.println("输入有误，退出程序");
            }
        } while (loop);
        System.out.println("退出零钱通程序");
    }


}
