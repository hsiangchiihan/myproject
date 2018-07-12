package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuMain {
	List<Menu> menus = new ArrayList<>();
	public MenuMain(){
		readMenus();
		for(Menu m : menus){
			System.out.println(m.getId()+"."+m.getName());			
		}
		
		for(Menu m : menus){						
			System.out.println("0.結算");
			Scanner sc = new Scanner(System.in);		
			System.out.println("請輸入餐點編號:");
			int item =sc.nextInt();
			System.out.println("請輸入數量:");
			int num = sc.nextInt();
			System.out.println("目前餐點");
			System.out.println(num+"份"+ m.getName());																					
		    System.out.println((num*m.getPrice()));
		    System.out.println("===================");
		}
		
			}
		
    public void readMenus(){		
	    try {		
	    FileReader fr =new FileReader("menu.txt");
		BufferedReader in = new BufferedReader(fr);
		String line = in.readLine();
		while(line!=null){
			String[] tokens =line.split(",");
			int id = Integer.parseInt(tokens[0]);
			String name = tokens[1];
			int price = Integer.parseInt(tokens[2]);
			int kcal = Integer.parseInt(tokens[3]);
			Menu m = new Menu(id, name, price, kcal);
			menus.add(m);
			line = in.readLine();
		   }	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MenuMain main =new MenuMain();
	main.readMenus();
	}

}
