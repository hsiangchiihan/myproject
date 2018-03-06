package com.bruce;

import java.util.Random;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random random = new Random();
int[] cards = new int[53];
for(int i = 1; i <53; i++){
	cards[i]= i;
}
for(int i = 1; i <53; i++){
	int r = random.nextInt(52)+1;
	int tmp = cards[i];
	cards[i]= cards[r];
	cards[r]= tmp;
}
for (int i = 1; i < 53; i++){

	}
	}
}
