import java.util.ArrayList;

public class Contenitore {

    ArrayList <Thread> contenitore;


    //prima parte
    public Contenitore (){
        contenitore = new ArrayList<Thread>();
    }

    public void insert (Thread oggetto){
        contenitore.add(oggetto);
    }
    public void start (){
        for (int i=0;i<contenitore.size();i++){
            contenitore.get(i).start();
        }
    }
    public void interrupt (){
        for (int i=0;i<contenitore.size();i++){
            contenitore.get(i).interrupt();
        }
    }
    public void join () throws InterruptedException{
        for (int i=0;i<contenitore.size();i++){
            contenitore.get(i).join();
        }
    }

    //seconda parte

    public void insert_Name (Thread th){
        if (contenitore.get(ricerca(th.getName())) != null){
            System.out.println("Esiste già");
        } else {
            contenitore.add(th);
            System.out.println("Aggiunto");
        }
    }
    public String get (String nome){
        if (contenitore.get(ricerca(nome)) != null){
            return contenitore.get(ricerca(nome)).getName();
        } else {
            return null;
        }

    }
    public void interrupt_Name (String nome){
        contenitore.remove(ricerca(nome));
    }
    public void join_Name(String nome) throws InterruptedException{
        contenitore.get(ricerca(nome)).join();
    }
    
    private int ricerca (String nome){
        boolean controllo = false;
        int x = -1;
        for (int i=0;i<contenitore.size();i++){
            if (contenitore.get(i).getName() == nome){
                controllo = true;
                x = i;
            }
        }
        if (controllo){return x;}
        else {return x;}
    }

}