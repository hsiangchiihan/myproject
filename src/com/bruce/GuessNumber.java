package com.bruce;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int number =0;
    for(int i=0;i<3;i++) number +=(int)(Math.random()*10); 
    System.out.println(number);
    
    Scanner scanner =new Scanner(System.in);
    int result =1;
    while(result ==1){
    int guess =scanner.nextInt();
	    if (guess>number){
	    	System.out.println("too large!");
	    }else if (guess<number){
	    	System.out.println("too small!");
	    }else{
	    	System.out.println("Correct!");
	    	result++;
	    }
    }
	}

}
