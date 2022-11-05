public class Cliente extends Thread{

    private String nome; 

    public Cliente (String nome){
        this.nome = nome;
        currentThread().setName(nome);
    }

    public void  prenotazione (){
        synchronized (Cliente.class){
        if (Teatro.numPosti < Teatro.numCapienza){
            Teatro.numPosti++;
            Teatro.nomi.add(currentThread().getName());
            System.out.println("Sono " + this.nome + " ho prenotato");
        } else {
            System.out.println("Il teatro è al completo");
        }}
    }
    public void run (){
        prenotazione();
    }
}
