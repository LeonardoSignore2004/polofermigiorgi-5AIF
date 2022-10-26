import java.util.ArrayList;

public class Contenitore extends Thread {
    ArrayList<Thread> threadsArray;

    public Contenitore (){threadsArray = new ArrayList<Thread>();}

    public void insert (Thread th1){
        threadsArray.add(th1);
    }

    public void start (){
        for (int i=0;i<threadsArray.size();i++){
            threadsArray.get(i).start();;
        }
    }


    public void interrupt (){
        for (int i=0;i<threadsArray.size();i++){
            threadsArray.get(i).interrupt();
        }
    }

    public void aspetta () throws InterruptedException{
        for (int i=0;i<threadsArray.size();i++){
            threadsArray.get(i).join();
        }
    }

}
