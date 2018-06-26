package com.java2.oo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberMain {
    /*public NumberMain(){
    	List<Number> numbers =new ArrayList<>();
    }*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //NumberTest nt =new NumberTest();
    
    try {
		FileReader fr =new FileReader("number.txt");
		BufferedReader in =new BufferedReader(fr);						
		String line,tempstring;
	    String[] tempArray= new String[10];
	    ArrayList<String> myList = new ArrayList<String>();	    
	    int i=0;
	    while((line = in.readLine())!=null){
	           //br.readLine()讀取txt檔的每一行資料,把讀到的資料存到line	           
	         tempstring = line; 	             	         
	           //會依照,來切割,剛好切10個,所以tempArray的大小宣告10
	         tempArray = tempstring.split(",");	             
	           //這邊就是按照順序,一行一行的儲存到動態陣列裡面
	         for(i=0;i< tempArray.length;i++){          
	                myList.add(tempArray[i]);	        	 	  
	         }
	    }	  
	       //這邊的除10,和矩陣的宣告大小,其實就是上面講的 "tempArray.length"這個值來做決定的
	       //y小於10,也是從"tempArray.length"的概念來的
	    int k = myList.size()/10;
	    int count=0;
	    double[][] trans_array = new double[k][10];        
	    for(int x=0;x<myList.size()/10;x++){
	          for(int y=0;y<10;y++){
	               trans_array[x][y]=Double.parseDouble((String) myList.get(count)); 	      	  
	               count++; 	               
	    }//這邊的方法是二維陣列來存取的，已經成功的將文字檔的資料存放到一個Double二維陣列上
	          
	          //這裡可以隨意處理資料
	          System.out.println(trans_array[1][5]-trans_array[0][0]);
	          
}
	        
	        
	        
	    /*String line = in.readLine();				
	    String[] tokens =line.split(",");
		int num  =Integer.parseInt(tokens[0]);
		int num1 =Integer.parseInt(tokens[1]);
		int num2 =Integer.parseInt(tokens[2]);
		System.out.println(num2-num);*/
		//System.out.println();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	}

}
