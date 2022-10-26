public class Contatore extends Thread{
    private int contatore;

    Contatore(){
        this.contatore=0;
    }

    public void run (){
        long tempoIniziale = System.currentTimeMillis();
        long tempoFinale = tempoIniziale;
        
        while ((tempoFinale-tempoIniziale) < 5000){
            tempoFinale = System.currentTimeMillis();
            System.out.println(contatore);
            contatore++;
        };
    }
}
