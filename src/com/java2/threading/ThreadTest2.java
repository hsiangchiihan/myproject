package com.java2.threading;

public class ThreadTest2 implements Runnable{
    public void run(){
    	//Thread的起點
    	for (int i=0 ;i<50000;i++){
        	System.out.println("使用創造的Thread");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Thread t =new Thread(new ThreadTest2());
    t.start();
	    for (int i=0 ;i<50000;i++){
    	    System.out.println("Main裡的Thread");
        }
	}

}
