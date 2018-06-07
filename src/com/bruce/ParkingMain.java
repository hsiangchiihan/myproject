package com.bruce;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParkingMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm");
    Date enter =sdf.parse("2018-06-07 08:00");
    Car c =new Car("001",enter);
    ParkingLot lot= new ParkingLot();
    lot.addCar(c);
    Date leave =sdf.parse("2018-06-07 18:00");
    int fee =lot.checkOut(c, leave);
    System.out.println(fee);
	}

}
