package com.bruce;

import java.util.HashSet;
import java.util.Iterator;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<Integer>set = new HashSet();
    set.add(88);
    set.add(55);
    set.add(67);
    set.add(25);
    set.add(23);
    set.add(15);
    System.out.println(set);
    set.add(25);
    System.out.println(set);
    
    Iterator<Integer>it = set.iterator();
    while(it.hasNext()){
    	System.out.println(it.next());
    }
	}

}
