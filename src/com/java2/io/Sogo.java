package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Sogo {
	Scanner scanner = new Scanner(System.in);
	public Sogo() {
	}
    public void start(){
    	int function =0;
    	while(function !=3){
    		showFunction();
    		function = scanner.nextInt();
    		switch(function){
    		case 1:
    			inputSale();
    			break;
    		case 2:
    			try{
    			FileInputStream fis = new FileInputStream("Sale.txt");
    			InputStreamReader isr =new InputStreamReader(fis);
    			BufferedReader in = new BufferedReader(isr);
    			String line =in.readLine();
    			while(line != null){
    				String[]token =line.split("\t");
    				
    			}
    			}catch(FileNotFoundException e){
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			break;
    		case 3:
    			return;
    		}
    	}
    }
	public void inputSale(){
		try {
			FileOutputStream fos = new FileOutputStream("Sale.txt");
			PrintStream out =new PrintStream(fos);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void showFunction(){
		System.out.println("請輸入功能(1~3)");
		System.out.println("1)請輸入銷售紀錄:");
		System.out.println("1)印出銷售報表:");
		System.out.println("3)結束程式");
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
	}
}