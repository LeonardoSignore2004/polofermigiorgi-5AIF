import java.util.ArrayList;

public class Contenitore extends Thread {
    ArrayList<Thread> threadsArray;

    public Contenitore (){threadsArray = new ArrayList<Thread>();}
    /*
     * return true se nome è presente nell'array
     * return false altrimenti
     */

    public boolean controllaNome (String nome){
        int controllo = -1;
        for (int i=0;i<threadsArray.size();i++){
            if (nome == threadsArray.get(i).getName()){controllo = 1;}
        }
        if (controllo == 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean insertName (Contenitore th1){
        if (controllaNome(th1.getName())){
            threadsArray.add(th1);
            return true;
        } else {
            return false;
        }
        
    }

    public void start (){
        for (int i=0;i<threadsArray.size();i++){
            threadsArray.get(i).start();;
        }
    }


    public void interruptAll (){
        for (int i=0;i<threadsArray.size();i++){
            threadsArray.get(i).interrupt();
        }
    }

    public void joinAll () throws InterruptedException{
        for (int i=0;i<threadsArray.size();i++){
            threadsArray.get(i).join();
        }
    }
    public Thread getName (String nome){
        Thread th = new Thread();
        int controllo = -1;
        for (int i=0;i<threadsArray.size();i++){
            if (threadsArray.get(i).getName() == nome){
                th = threadsArray.get(i);
                controllo = 1;
                
            }
        }
        if (controllo == -1){
            return null;
        } else {
            return th;
        }
    }

    public boolean interruptName (String nome){
        int controllo = -1;
        for (int i=0;i<threadsArray.size();i++){
            if (threadsArray.get(i).getName() == nome){
                threadsArray.get(i).interrupt();
                controllo = 1;
            }
        }

         if (controllo == 1){
            return true;
         } else return false;
    }

    public boolean joinName (String nome) throws InterruptedException{
        int controllo = -1;
        for (int i=0;i<threadsArray.size();i++){
            if (threadsArray.get(i).getName() == nome){
                threadsArray.get(i).join();
                controllo = 1;
            }
        }

         if (controllo == 1){
            return true;
         } else return false;
    }

    public boolean removeName (String nome) throws InterruptedException{
        int controllo = -1;
        for (int i=0;i<threadsArray.size();i++){
            if (threadsArray.get(i).getName() == nome){
                threadsArray.remove(i);
                controllo = 1;
            }
        }

         if (controllo == 1){
            return true;
         } else return false;
    }
    





}
