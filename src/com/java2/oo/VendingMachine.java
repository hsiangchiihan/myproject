package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class VendingMachine {
	
	int total =0;
	List<Drink> drinks =new ArrayList<>();
	
	public void on(){
		System.out.println("Please enter drink's number:");
		for (int i=0;i<drinks.size();i++){
			Drink drink =drinks.get(i);
			System.out.println(drink.getId()+"\t"+drink.getName()+"\t"+drink.getPrice());			
		}
		Scanner s =new Scanner(System.in);
	    int data =-1;
	    while(data !=0){
	    	data =s.nextInt();
	    	switch(data){
	    	case 1:
	    		System.out.println("You chose Coke.");
	    		break;
	    	case 2:
	    		System.out.println("You chose Juice.");
	    		break;
	    	case 3:
	    		System.out.println("You chose Sprite.");
			case 0:
				break;
			}
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
