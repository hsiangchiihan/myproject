package com.stepik.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*List<Integer> list = new ArrayList<>();
	       list.add(2);
	       list.add(0);
	       list.add(1);
	       list.add(7);
	     System.out.println(list);*/
	     
	     /*List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));

	     
	     for (String name : nameList){
	     System.out.println(name);
	}*/
	    /*List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));


	    //write your code here
	    String[] strArray = nameList.toArray(new String[0]);

	    for (int i = 0; i < strArray.length; i++) {
	      System.out.println(strArray[i]);
	    }*/
		
		/*SortedSet<String> set =new TreeSet<>(Arrays.asList("Gamma", "Alpha", "Omega"));	      
	    System.out.println(set);*/
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mr.Green");
		list.add("Mr.Red");
		list.add("Mr.Yellow");		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	    
	}
}
