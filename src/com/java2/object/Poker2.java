package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Integer> cards = new ArrayList<>();
    List<Integer> deal_cards =new ArrayList<>();    
    int randomnum =0;
    for (int j=0; j < 52 ; j++ ){    
        cards.add(j+1);
      }
    for (int j=0; j < 52 ; j++ ){
        randomnum = (int)(Math.random() * cards.size());   
        deal_cards.add(cards.get(randomnum));   
        cards.remove(randomnum);    
      }
    int pai=0;
    String flower = "";
    String paiarr[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String pai_no="";
    for (int i=0; i < deal_cards.size() ; i++ ){  
        pai = deal_cards.get(i);  
      if(pai >= 1 && pai <= 13){  
        flower = "S"; 
        pai_no = paiarr[pai];
      }
      if(pai >= 14 && pai <= 26){
        flower = "H"; 
        pai_no = paiarr[pai - 13];
      }
      if(pai >= 27 && pai <= 39){
        flower = "D"; 
        pai_no = paiarr[pai - 26];
      }  
      if(pai >= 40 && pai <= 52){
        flower = "C"; 
        pai_no = paiarr[pai - 39];
      }
      
      if((i % 13) == 0 && i != 0)
        System.out.print("\n");
      
      if((i % 13) == 0)
        System.out.print("玩家" + ((i / 13)  + 1) + "的牌 :  \t");
 
      System.out.print(flower + pai_no+"\t");  
    }
	}	
    }



