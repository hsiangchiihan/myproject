package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int total =0;
	List<Drink> drinks =new ArrayList<>();
	
	public void on(){
		System.out.println("Please insert coins:");
		for (int i=0;i<drinks.size();i++){
			Drink drink =drinks.get(i);
			System.out.println(drink.getId()+"\t"+drink.getName()+"\t"+drink.getPrice());			
		}
		Scanner s =new Scanner(System.in);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
