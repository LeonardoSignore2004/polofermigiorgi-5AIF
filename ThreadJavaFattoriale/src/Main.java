import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner (System.in);
        int N = s.nextInt();
        s.close();

        Fattoriale fatt[] = new Fattoriale[N];

        for (int i=0;i<N;i++){
            fatt[i] = new Fattoriale(new Random().nextInt(9)+1,N);
            fatt[i].start();
            //fatt[i].join();
        }

        fatt[0].toStringhe(N);
        
    }
}
