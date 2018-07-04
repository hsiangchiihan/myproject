package com.stepik.practice;

import java.text.DecimalFormat;
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
		
		/*Scanner scanner =new Scanner(System.in);
		int ans =scanner.nextInt();
		int hun =ans/100;
		int ten =(ans/10)%10;
		int one =((ans%100)*100)%10;
		System.out.println(hun+ten+one);*/
		
		/*System.out.println("Please insert the distances from two cities: ");
		Scanner sc1 =new Scanner(System.in);
		float distance =sc1.nextFloat();
		System.out.println("Please insert the travel time by bus in hours:");
		Scanner sc2 =new Scanner(System.in);
		float time =sc2.nextFloat();
		System.out.println(distance/time);*/
		
		/*Scanner sc =new Scanner(System.in);
		float ans =sc.nextFloat();
		System.out.println((ans*10)%100);*/
		
		/*DecimalFormat formatter = new DecimalFormat("#.#");
		System.out.println(formatter.format(0.9));*/

	    Scanner scanner = new Scanner(System.in);
	    double d = Math.abs(scanner.nextDouble());
	    d = Math.floor(d*10);
	    String s = Integer.toString((int)d);
	    System.out.println(s.charAt(s.length()-1));
	}
	/*public static int getDecimalBits2(double target) {
	    if (0.0 == target % 1) {
	        return 0;
	    } else {
	        return Double.toString(target).split("\\.")[1].length();    
	    }
	}*/

}
