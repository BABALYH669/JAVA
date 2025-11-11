package HomeWork._08;

public enum Color implements show{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;
    Color(int redValue,int greenValue,int blueValue){
        //有参构造器
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    Color() {
        //无参构造器
    }

    @Override
    public void showColor() {
        System.out.println("颜色是"+redValue+","+greenValue+","+blueValue);
    }
}
