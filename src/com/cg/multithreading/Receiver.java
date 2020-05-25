package com.cg.multithreading;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
    private Data load;
  
  
    public Receiver(Data data) {
    	this.load = data;
}


	public void run() {
        for(String receivedMessage = load.receive();
          !"End".equals(receivedMessage);
          receivedMessage = load.receive()) {
             
            System.out.println(receivedMessage);
 
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                System.out.println("Thread interrupted");
            }
        }
    }
}
