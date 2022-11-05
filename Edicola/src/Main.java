public class Main {
    public static void main(String[] args) throws InterruptedException {

        Cliente c1 = new Cliente ("Mario",5,13);
        Cliente c2 = new Cliente ("Giacomo",1,4);
        Cliente c3 = new Cliente ("Edoardo",10,10);
        Cliente c4 = new Cliente ("Pietro",7,11);

        Edicola edicola = new Edicola(100, 23);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        
        System.out.print("------------------------------------------------------------- \n");
        System.out.println("il numero di matite è " + Edicola.numMatite );
        System.out.println("Il numero di quaderni è: "+ Edicola.numQuaderni);
    }
}