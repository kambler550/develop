package com.first.prodCon;

import java.util.List;

public class Consumer implements Runnable{

	private Data data;
	
	public  Consumer(Data data) {
	this.data = data;		
	}
	
	@Override
	public void run() {
			 data.consume();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

}
