package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
}
