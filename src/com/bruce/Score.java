package com.bruce;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("½Ð¿é¤J¦¨ÁZ:");
	Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int score = Integer.parseInt(line);
    System.out.println(score);
    if (score<60){
    System.out.println("*");
    
    
    }
    
	}

}
