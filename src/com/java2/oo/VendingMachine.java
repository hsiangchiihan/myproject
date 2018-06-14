package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class VendingMachine {
		
	int total =0;
	List<Drink> drinks =new ArrayList<>();
				
	/*public int getShopping (int i,double p){
		Scanner scanner =new Scanner(System.in);		
		int coins =0;
		coins =scanner.nextInt();
		if(i==1)
		{
			if(p<drinks.tokens[2])
			{
				System.out.println("Not enough money!");
			}
			else
			{
				coins=p-tokens[2];
			}
		}
		if(i==2)
		{
			if(p<tokens[4])
			{
				System.out.println("Not enough money!");
			}
			else
			{
				coins=p-tokens[4];
			}
		}
		if(i==3)
		{
			if(p<tokens[6])
			{
				System.out.println("Not enough money!");
			}
			else
			{
				coins=p-token[6];
			}
		}	
		return coins;
	}*/
	public void on(){
		System.out.println("Please insert coins: ");
		for (int i=0;i<drinks.size();i++){
			Drink drink =drinks.get(i);
			System.out.println(drink.getId()+"\t"+drink.getName()+"\t"+drink.getPrice());			
		}
		Scanner s =new Scanner(System.in);
		int coins =0;
		coins =s.nextInt();
		System.out.println("Please select drinks' number(1~3): ");
		Scanner s1 =new Scanner(System.in);
		int data =-1;
		while (data !=0){
			data =s1.nextInt();
			switch(data){
			case 1:
				int change =0;
				change =coins-25;
				System.out.println("You chose Coke.");
				System.out.println("To give change"+change);
				data++;
				break;
				
			case 2:
				int change1 =0;
				change1 =coins-30;
	    		System.out.println("You chose Juice.");
	    		System.out.println("To give change"+change1);
	    		data++;
	    		break;
	    	case 3:
	    		int change2 =0;
				change2 =coins-20;
	    		System.out.println("You chose Sprite.");
	    		System.out.println("To give change"+change2);
	    		data++;
	    		break;
			case 0:
				break;
			}
		}	    	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
