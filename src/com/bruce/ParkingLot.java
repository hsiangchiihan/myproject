package com.bruce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParkingLot {
    int size =50;
    int hourFeed =30;
    List<Car> cars =new ArrayList<>();
    
    public void addCar(Car car){
    	cars.add(car);
    }
    
    public int checkOut(Car car ,Date leave){
    	long duration =leave.getTime() -car.getEnter().getTime();
    	long hour =duration/1000/60/60;
    	long minute =(duration/1000/60)%60;
    	long fee =hourFeed *hour +(minute>30 ? hourFeed:hourFeed/2);
    	return (int)fee;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
