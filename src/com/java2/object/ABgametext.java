package com.java2.object;

import java.util.Arrays;
import java.util.Scanner;

public class ABgametext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String subject="";
		for(int i=0;i<4;i++) subject+=(int)(Math.random()*10); 
		
		System.out.println("random: "+subject);
		int round =1;
		while(true){
			int a=0,b=0;
			boolean check[]=new boolean[4];
			Arrays.fill(check, false);
			String guess=sc.next(); 
			
			for(int i=0;i<4;i++){
				if(subject.charAt(i)==guess.charAt(i)){
					a++;
					check[i]=true;
					
				}
			}
			
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(!check[j] && subject.charAt(j)==guess.charAt(i)){
						b++;
						check[j]=true;				
						break;
					}
				}
			}
			
			if(a==4){
				System.out.println("Correct!"+" "+"The answer is:"+subject);
				System.out.println("You tried "+""+round+""+" rounds");				
				break;
			}
			else{
				System.out.println(a+"A"+b+"B");
				round++;
			}
		}
	}

	}


