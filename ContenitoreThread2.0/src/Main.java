import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Contenitore contenitore = new Contenitore();
        int x = new Random().nextInt(9);
        Thread t = new Thread();
        for (int i=0;i < x;i++){
            System.out.println(x);
            contenitore.insert(t);
        }
        contenitore.join();
        contenitore.interrupt();
        
    }
}