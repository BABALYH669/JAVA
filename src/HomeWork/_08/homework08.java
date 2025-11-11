package HomeWork._08;

public class homework08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.showColor();

        switch (green){
            case GREEN :
                System.out.println("匹配到绿色");
                break;
            case RED:
                System.out.println("匹配到红色");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }

}
