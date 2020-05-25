package com.first.prodCon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Data {

	public LinkedList<Integer> list = new LinkedList<>();
	public static final int MAX_CAPACITY = 10;
	
	public synchronized void produce(Integer num) {
		if(list.size() == MAX_CAPACITY) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		list.add(num);
		System.out.println("inside produce : "+num+" added");

		notify();
	
	}
	
	
	public synchronized void consume() {
		//System.out.println("inside consume : "+ list.size());
		
			while(list.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
				int num =  list.removeFirst();
				System.out.println("inside consume : "+num+" removed");
	
			notify();
			}
		
		

	}
	
}
