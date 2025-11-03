package HomeWork01;

public class EnumExercise {
    public static void main(String[] args) {
        Today[] today = Today.values();
        for(Today today1 : today){
            System.out.println(today1);
        }
    }
}

enum Today{
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期日");

    private String day;

    Today(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "今天是" + day;
    }
}