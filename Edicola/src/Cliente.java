public class Cliente extends Thread {

    private String nome;
    private int numMatite;
    private int numQuaderni;

    public Cliente (String nome,int numMatite, int numQuaderni){
        this.nome = nome;
        this.numMatite = numMatite;
        this.numQuaderni = numQuaderni;
    }
    
    public int getNumMatite() {
        return numMatite;
    }

    public void setNumMatite(int numMatite) {
        this.numMatite = numMatite;
    }

    public int getNumQuaderni() {
        return numQuaderni;
    }

    public void setNumQuaderni(int numQuaderni) {
        this.numQuaderni = numQuaderni;
    }

    public synchronized void compra (){
        synchronized (Cliente.class){
          if (Edicola.numQuaderni >= numQuaderni & Edicola.numMatite >= numMatite){ 
            Edicola.numQuaderni -= numQuaderni;
            Edicola.numMatite -= numMatite;
            System.out.println("Sono " + currentThread().getName() +" - rimangono " + Edicola.numQuaderni + "quaderni"+" - rimangono " + Edicola.numMatite+ " matite");
        } else {
            System.out.println("Il numero di matite e/o di quaderni è insufficente");
        }  
        }
        
    }

    public void run (){
        compra();
    }
}
