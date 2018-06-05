package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*open bingo.txt
 
*/
public class Bingo {
    List<Integer> numbers =new ArrayList<>();
    int count;
    int row;
    public Bingo(int count){
    	this.count =count;
    	for (int i=0;i<count;i++){
    		numbers.add(i+1);
    	}
    	Collections.shuffle(numbers);
    }
    public void print(){
    	for(int i=0;i<count;i++){
    		int n =numbers.get(i);
    		System.out.println(n<10 ?" ":"");
    		System.out.println(n+" ");
    		if (i%(row) ==4){
    			
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
