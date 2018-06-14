package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VendingMain {
/*public VendingMain(){	
}*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    VendingMachine vm =new VendingMachine();
    FileReader fr;
    try {
		fr = new FileReader("vending.txt");
		BufferedReader in =new BufferedReader(fr);
		String line =in.readLine();
		String[] tokens =line.split(",");
		int count =Integer.parseInt(tokens[0]);		
		for(int i=0;i<count;i++){
			String name =tokens[i*2+1];
			int price =Integer.parseInt(tokens[i*2+2]);			
			vm.drinks.add(new Drink(i+1,name,price));
		}
		vm.on();
		/*System.out.println(" ");
		System.out.print("To pay the bill:");
		Scanner sp=new Scanner(System.in);
		int n1 =sp.nextInt();*/	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
