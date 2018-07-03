package com.stepik.practice;

import java.util.Random;
import java.util.Scanner;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(((((n+1)*n)+2)*n)+3);*/
		
		/*Scanner ss =new Scanner(System.in);
	    int N = ss.nextInt();
	    Scanner sn =new Scanner(System.in);
	    int K = sn.nextInt();
	    System.out.println(K/N);*/
		
		 /*Scanner sc  = new Scanner(System.in);
	     int n =sc.nextInt();
	     System.out.println((n / 10) % 10);*/
		
		/*int num = (int)(Math.random()*6)+1;
		System.out.println(num);*/
		
		/*for(int i = 1 ; i< 10 ; i++){
		      for(int j = 1 ; j <10 ; j++){
		         System.out.print(""+i+"*"+j+"="+(i*j)+"\t");		         
		   }
		      System.out.println();
		  }*/
		
		/*for(int k =0;k<9;k += 3){
			for(int j=1;j<10;j++){
				for(int i=1; i<4; i++){
					System.out.printf("%d * %d = %d \t" , i + k , j , j * ( i + k ));
				}
				System.out.println();
			}
			System.out.println();
		}	*/
		
		/*Scanner scanner =new Scanner(System.in);
		int answer =scanner.nextInt();
		System.out.println(answer/10);*/
		
		Scanner scanner =new Scanner(System.in);
		int ans =scanner.nextInt();
		int hun =ans/100;
		int ten =(ans/10)%10;
		int one =((ans%100)*100)%10;
		System.out.println(hun+ten+one);
	}

}
