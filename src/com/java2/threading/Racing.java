package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Horse> list = new ArrayList<>();	
		
    Horse h1 =new Horse(list);
    h1.start();
    Horse h2 =new Horse(list);
    h2.start();
    Horse h3 =new Horse(list);
    h3.start();
    try{
    	h1.join();
    	h2.join();
    	h3.join();
    }catch (InterruptedException e){
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    }
    //Horse h2 =new Horse();
    //h2.start();
    /*HorseRunable h2 =new HorseRunable();
    Thread thr =new Thread(h2);
    thr.start();
    try {
		h1.join();
		thr.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("main ended");*/
        
		/*List<Horse> horses =new ArrayList<>();
		for (int i =0;i<10;i++){
			Horse h = new Horse();
			horses.add(h);		
			h.start();
		}*/
    System.out.println(list);
    System.out.println("main ended");
	}

}
