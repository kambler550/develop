package com.first.prodCon;

public class Producer implements Runnable{

	private Data data;
	
	public Producer(Data data) {
		this.data = data;
	}
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			data.produce(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
