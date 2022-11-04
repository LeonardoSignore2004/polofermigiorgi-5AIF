public class Main {

    public static void main(String[] args) {
        Teatro teatro = new Teatro(2);

        Cliente aldo = new Cliente("ALDO");
        Cliente mario = new Cliente("MARIO");
        Cliente giacomo = new Cliente ("GIACOMO");
        Cliente carlo = new Cliente("CARLO");

        aldo.start();
        mario.start();
        giacomo.start();
        carlo.start();
    }
    

    
}
