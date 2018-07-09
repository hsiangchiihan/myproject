package com.stepik.practice;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num[] =new int[7];
    int a =0;
    int i;  
    
    for(i =0;i<=6;i++){
    	a = (int)(Math.random()*42)+1;
    	int b=0;
    	while(b<i){ //a跟b做比對，如果一樣再重新產生亂數
    		if (num[b] ==a){
    			a =(int)(Math.random()*42)+1;
    			b =0;
    		}else{
    			b ++;
    		}
    	}
    	num[i] =a;
    	if(i<6){
    		System.out.println("第"+(i+1)+"個號碼:");
    	}else{
    		System.out.println("特別號:");
    	}if(num[i] <10){
    		System.out.println("0"+num[i]);
    	}else{
    		System.out.println(num[i]);
    	}
    }
	}

}
