package com.bruce;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> list = new ArrayList();
    list.add(5);
    list.add(13);
    list.add(55);
    list.add(28);
    list.add(39);
    System.out.println(list);
    System.out.println(list.size());
    int sum = 0;
    for (int i = 0;i<list.size();i++){
    	sum = sum+list.get(i);
    }
    System.out.println(sum/list.size());
    
    list.remove(3);
    System.out.println(list);
    
    if (list.size()>0){
    	int sum1 = 0;
    	for (int i = 0;i<list.size();i++){
    		sum1 = sum1+list.get(i);
    	}
    System.out.println(sum1/list.size());  //與33行擇一可去掉 
    }
    
    int sum1 = 0;
    for (int i = 0;i<list.size();i++){
    	sum1 = sum1+list.get(i);
    }
    System.out.println(sum1/list.size());  //與26行擇一可去掉
	}

}
