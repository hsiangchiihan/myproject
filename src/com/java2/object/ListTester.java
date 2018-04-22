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
    int num=cards.size();
    //System.out.println("Removing number:" +cards.remove(0));
    System.out.println("總共有"+num+"個");
    System.out.println("第二位置的數為:"+cards.get(2));
    
    for(int i=0;i<num;i++)
    System.out.println(cards.get(i));
	}

}
