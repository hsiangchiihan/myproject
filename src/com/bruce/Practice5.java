package com.bruce;

import java.util.Scanner;

public class Practice5
/*有例外處理的販賣機*/
{
	private String coffee="coffee";
	private String coke="Coke";
	private String tea="tea";
	private double coffeeprice=2.00;
	private double cokeprice=3.00;
	private double teaprice=5;
	private double price=0.0;
	public Practice5(){		
	}
	public void getName(int i)
	{
		if(i==1)
		{
			System.out.println("You choice coffee.");
		}
		
		if(i==2)
		{
			System.out.println("You choice Coke.");
		}
		
		if(i==3)
		{
			System.out.println("You choice tea.");
		}
	}
	public double getShopping(int i,double p)
	{
		if(i==1)
		{
			if(p<coffeeprice)
			{
				System.out.println("Not enough money!");
			}
			else
			{
				price=p-coffeeprice;
			}
		}
		
		if(i==2)
		{
			if(p<cokeprice)
			{
				System.out.println("Not enough money!");
			}
			else
			{
				price=p-cokeprice;
			}
		}
		
		if(i==3)
		{
			if(p<teaprice)
			{
				System.out.println("Not enough money!");
			}
			else
			{
				price=p-teaprice;
			}
		}
		
		return price;
	}
	
	public static void main(String[] args)
	{
		Practice5 shop=new Practice5();
		try
		{
			System.out.println("Please enter items' number:\n 1.coffee:$2.00 2.Coke:$3.00 3.tea:$5.00");
			Scanner si=new Scanner(System.in);
			int i=si.nextInt();
			System.out.println(" ");
			if(i>3||i<1)
			{
				System.out.println("lack of supplies");
			}
			else
			{
				shop.getName(i);
				System.out.println(" ");
				System.out.print("To pay the bill:");
				Scanner sp=new Scanner(System.in);
				double p=sp.nextDouble();
				System.out.println(" ");
				if(shop.getShopping(i,p)!=0.0)
				{
					System.out.println("To give change："+shop.getShopping(i,p));
				}
			}
		}
		catch(Exception ex)
		{
			System.out.println("Please enter correct items' number!");
		}
	}
}
