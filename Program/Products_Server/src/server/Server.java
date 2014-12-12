/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BagusThanatos (github.com/BagusThanatos)
 */
public class Server {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Database d = new Database(); System.out.println("success connecting to database database");
        ServerSocket s;
        try {
            s= new ServerSocket(9999);
            while (true){
                ServerThread st = new ServerThread(s.accept());
                st.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
