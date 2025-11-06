package HomeWork._02;

public class Frock {
    //衣服出厂的序列号起始值
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        serialNumber = Frock.getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public static int getNextNum(){
        return currentNum += 100;
    }

}
