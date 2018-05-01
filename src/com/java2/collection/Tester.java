package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> list =new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    
    Set<Integer> set =new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(4);
    set.add(5);
    System.out.println(set);
    
    Set<String> set2 =new HashSet<>();
    set2.add("Bruce");
    set2.add("Jhon");
    set2.add("Jackson");
    set2.add("Manson");
    set2.add("Ray");
    System.out.println(set2);
    
    
    Map<String,String> stacks =new TreeMap<>();//要排序用Tree;不用排序用Hash
    stacks.put("2330", "TSMC");
    stacks.put("2317", "Honghai");
    System.out.println(stacks);
	}

}
