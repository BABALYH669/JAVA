package interface_;

public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();

        computer.Work(phone);
        computer.Work(camera);
    }
}
