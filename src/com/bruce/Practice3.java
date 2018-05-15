package com.bruce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SortedSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(3);

		Set<Integer> set2 = new LinkedHashSet<>();
		set2.add(3);
		set2.add(1);
		
		
		System.out.println(set1);
		System.out.println(set2);*/
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("Mr.Green");
		list.add("Mr.Red");
		list.add("Mr.Yellow");		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		/*Set<Integer> set1 = new HashSet<>();
		set1.add(0);
		set1.add(1);
		set1.add(2);*/
	    //SortedSet<String> set =new TreeSet<>(Arrays.asList
	    	//	("postgres", "sqlite", "oracle","mongodb","postgres","mssql","6"));
		/*ArrayList<String> list = new ArrayList<String>();
		list.add("mongodb");
		list.add("mssql");
		list.add("oracle");
        list.add("postgres");
        list.add("sqlite");
        list.add("6");
        list.remove(5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		/*List<String> list4 =new ArrayList<>();
		list4.add("Google");
		list4.add("Oracle");
		list4.add("JetBrains");
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(1);
		list3.add(2);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);*/
	   /* SortedSet<String> set =new TreeSet<>(Arrays.asList
	    		("Google", "Oracle", "JetBrains"));	      
	    System.out.println(set);*/
		String input ="Google Oracle JetBrains";
		String[] yourList = input.split("\\s+");
		System.out.println(yourList);
	}
}
