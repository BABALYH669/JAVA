package HomeWork01.Homework05;

public class HomeWork05 {
    public static void main(String[] args) {
        Waiter waiter = new Waiter("jack",100,365);
        Worker worker = new Worker("Marry",125,365);
        Peasant peasant = new Peasant("Fuck",150,365);
        Teacher teacher = new Teacher("God",300,365,15);
        Scientist scientist = new Scientist("Bid",500,365,10000);
        waiter.PrintingWages();
        worker.PrintingWages();
        peasant.PrintingWages();
        teacher.PrintingWages();
        scientist.PrintingWages();
    }
}
