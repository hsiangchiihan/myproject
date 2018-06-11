package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MazeMain {
 public MazeMain(){
	FileReader fr;
    try {
		fr =new FileReader("maze.txt");
		BufferedReader in =new BufferedReader(fr);
		String line =in.readLine();
		String tokens[] =line.split(",");
		int col =Integer.parseInt(tokens[0]);
		int row	=Integer.parseInt(tokens[1]);
		for(int i=0;i<col;i++){
			
		}
		for(int j=0;j<row;j++){
			
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
		new MazeMain();
		ArrayList<Integer> numList = new ArrayList<Integer>(); 
		for(int i = 1; i<= 5; i++){ 
		numList.add(i+5); 
		} 
		new Randomnum(numList).selectRandom(); 
		} 
	}
 
	class Maze{
		int row ,col;
		int trapCount;
		int[] traps;
		int[] positions;
		Player player;
		public Maze(int col,int row,int trapCount){
			this.col =col;
			this.row =row;
			this.trapCount =trapCount;
		}
	
	}
    class Player{
    	int hp =100;
    	int pos =0;
    }
    class Randomnum{
    	ArrayList<Integer> checkList;
    	Randomnum(ArrayList<Integer> num){
    		this.checkList =num;
    	}
    	void selectRandom(){
    		int i=1;
    		int times =1;
    		int count =5;
    	    while(times<=5){
    	    	i = checkList.get(new Random().nextInt(count--));
    	    	System.out.println(i);
    	    	checkList.remove((Object)i);
    	    	times++;
    	    }
    	}
    }
    

