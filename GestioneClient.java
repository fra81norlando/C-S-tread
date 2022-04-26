
package cscountdown;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestioneClient {
    public static void main(String[] args) {
        try {
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            String msgLetto = cli.leggi();
            System.out.println(msgLetto);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestioneClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
