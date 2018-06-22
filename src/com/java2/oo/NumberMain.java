package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NumberTest nt =new NumberTest();
    
    try {
		FileReader fr =new FileReader("number.txt");
		BufferedReader in =new BufferedReader(fr);
		String line = in.readLine();
		String[] tokens =line.split(",");
		
		/*int num  =Integer.parseInt(tokens[0]);
		int num1 =Integer.parseInt(tokens[1]);
		int num2 =Integer.parseInt(tokens[2]);
		System.out.println(num2-num);*/
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
