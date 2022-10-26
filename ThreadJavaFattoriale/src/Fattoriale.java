public class Fattoriale extends Thread {

    private int x;
    private static int matrice [][];
    private static int indice = 0;

    public Fattoriale(int x,int N) {
        this.x = x;
        if (indice==0){matrice= new int [N][2];}
    }

    public void run (){
        System.out.print("Sono " + currentThread().getName() +" -> " + x + " != " );
        Fattoriale.matrice[Fattoriale.indice][0] = x;
        for (int i=x-1;i>1;i--){
            x = x*i;
        }
        System.out.println(x);
        Fattoriale.matrice[Fattoriale.indice][1] = x;
        Fattoriale.indice ++;
    }

    public void toStringhe (int N){
        for (int i=0;i<N;i++){
            for (int j=0;j<2;j++){
                System.out.print("posizione: ["+i+"]"+"["+j+"]"+" "+Fattoriale.matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}