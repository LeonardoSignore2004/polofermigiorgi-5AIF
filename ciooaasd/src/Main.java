
public class Main {
    public static void main(String[] args) {
        Contatore t1 = new Contatore();
        Contatore t2 = new Contatore();
        Contatore t3 = new Contatore();

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
    }
}