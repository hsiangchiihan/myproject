package com.bruce;

import java.util.Scanner;

public class Score2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入分數:");
		Scanner scanner = new Scanner(System.in);
	    String line = scanner.nextLine();
	    int score = Integer.parseInt(line);
	    System.out.println(score);
	    if (score<60){
	    	System.out.println("*");
	    }else{
	    if (score>=80){
	    	System.out.println("@");
	    }else{
	    if (score==100){
	    	System.out.println("$");
	    }else{
	    	System.out.println("#");
	    }
	    }
	    }
	}

}
