package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> cards = new ArrayList<>();
    cards.add(0);
    cards.add(1);
    cards.add(3);
    cards.add(5);
    cards.set(1,99);
    System.out.println("Removing number:" +cards.remove(0));
    System.out.println(cards.size());
    System.out.println(cards.get(2));
    
	}

}
