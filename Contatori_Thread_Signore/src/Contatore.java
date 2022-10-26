import java.util.Random;

public class Contatore extends Thread{
    private int contatore;

    Contatore(){
        this.contatore=0;
    }

    public void run (){
        long tempoIniziale = System.currentTimeMillis();
        long tempoFinale = 0;
        while ((tempoIniziale-tempoFinale) < 5000){
            tempoFinale = System.currentTimeMillis();
            contatore++;
            System.out.println(currentThread().getName()+" "+contatore);

        };
    }
}
