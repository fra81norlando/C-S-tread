package cscountdown;

public class GestioneServer {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Server srv = new Server(2000);
        srv.inAscolto();
        srv.scrivi("Benvenuto client");
        
    }
    
}
