package com.java2.threading;

public class TimeWorker implements Runnable{
    private int times;
    public TimeWorker(int times){
    	this.times =times;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<this.times;i++){
			TimeCounter.count++;
		}
	}

}
