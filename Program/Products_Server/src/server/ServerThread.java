/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.Socket;

/**
 *
 * @author BagusThanatos (github.com/BagusThanatos)
 */
public class ServerThread extends Thread{
    private Socket s;
    
    public ServerThread(Socket s){
        super();
        this.s=s;
    }
    
    @Override
    public void run(){
        
    }
    
}
