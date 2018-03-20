package com.java2.object;

import java.util.Arrays;

public class ABgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String secret = "9873";
    String nums = "1356";
    //String nums = "5648";
    //String nums = "8496";
        int a =0;
        int b =0;
    	boolean check[]=new boolean[4];
    	Arrays.fill(check, false);
    	for(int i=0;i<4;i++){
			if(secret.charAt(i)==nums.charAt(i)){
				a++;
				check[i]=true;
			}
		}
    	for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(!check[j] && secret.charAt(j)==nums.charAt(i)){
					b++;
					check[j]=true;
					break;
				}
			}
    }
    	if(a==4){
			System.out.println("Correct");			
		}
		else{
			System.out.println(a+"A"+b+"B");
		}
    }
	}

  

	


