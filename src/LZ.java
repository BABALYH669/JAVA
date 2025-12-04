public class LZ {
    public static void main(String[] args) {

        int age = 130;
        if (!(age >= 20 && age <= 120)) {
            throw new AgeException("年龄应该在20~120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}