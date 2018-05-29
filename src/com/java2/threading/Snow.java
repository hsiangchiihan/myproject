package com.java2.threading;

import java.util.Random;

public class Snow extends Thread{
	Random random =new Random();
	int x;
	int y=800;
	public Snow(){
		x =random.nextInt(600);
	}
 @Override
 public void run(){
	 for(int i=800;i>0;i--){
		 y =y--;
		 int movement =random.nextInt(3)-1;
		 x =x-movement;
		 System.out.println(new String(new char[x]).replace("\0"," "));
		 System.out.println("@");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
