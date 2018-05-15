package com.java2.threading;

public class TimeCounter {
    public static int count =0;
    public static void main(String[] args) throws Exception{
    	long startTime = System.currentTimeMillis();
    	
    	/*for (int i=0;i<400000000;i++){
    		TimeCounter.count++;
    	}*/
    	
    	Thread t1 =new Thread(new TimeWorker(200000000));
    	Thread t2 =new Thread(new TimeWorker(200000000));
    	t1.start();
    	t2.start();
    	t1.join();
    	t2.join();
    	long endTime = System.currentTimeMillis();
    	System.out.println(endTime-startTime);
    }
}
