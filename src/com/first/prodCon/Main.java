package com.first.prodCon;

public class Main {

	public static void main(String[] args) {

		Data data = new Data();
		Thread t1 = new Thread(new Producer(data));
		Thread t2 = new Thread(new Consumer(data));
		
		t1.start();
		t2.start();
		
	}

}
