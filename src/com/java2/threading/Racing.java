package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*Horse h1 =new Horse();
    Horse h2 =new Horse();
    h1.start();
    h2.start();*/
		List<Horse> horses =new ArrayList<>();
		for (int i =0;i<10;i++){
			Horse h = new Horse();
			horses.add(h);		
			h.start();
		}
	}

}
