package com.java2.oo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*open bingo.txt
25
8,4,7,18,21,3,5,1,9,10
25代表有5*5共25顆球，產生時就亂數排列並列印出來
如下:
 5 10 11  8 25
13  6 21  4  1
22 15 23 19  7
 2 20 18  3 14
17  9 12 24 16
*/
public class Bingo {
    List<Integer> numbers =new ArrayList<>();
    int count =25;
    int row =5;
    int col =5;
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
    			System.out.println(" ");
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bingo bm = new Bingo(25);
		bm.print();
	}

}
