public class Main {
    public static void main(String[] args) throws Exception {
        Campana din = new Campana("din", 3,0);
        Campana dan = new Campana("dan", 3,200);
        Campana don = new Campana ("don",3,500);

        din.start();
        dan.start();
        don.start();
    }
}
