package com.java2.object;

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Random random = new Random();
    ArrayList<Integer> cards = new ArrayList<>();
    ArrayList<Integer> deal_cards =new ArrayList<>();    
    int randomnum =0;
    for (int j=0; j < 52 ; j++ ){    
        cards.add(j+1);
      }
    for (int j=0; j < 52 ; j++ ){
        randomnum = (int)(Math.random() * cards.size());   
        deal_cards.add(cards.get(randomnum));   
        cards.remove(randomnum);    
      }
    
    }
}


