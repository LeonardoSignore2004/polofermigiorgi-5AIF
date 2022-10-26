public class Campana extends Thread{


    private String suono;
    private int volte;
    private int ritardo;


    public Campana(String suono, int volte, int ritardo) {
        this.suono = suono;
        this.volte = volte;
        this.ritardo = ritardo;

    }


    public void run (){
        for (int i=0;i<volte;i++){
            if (i!=0){
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            } else {
                try {
                    Thread.sleep(ritardo);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

            System.out.println(suono);

    }
}


    


    
}
