package com.java2.schedule;

public class Course {
	String id;
    String name;
    int week;
    int time;
    int hours;
    public Course(String id,String name,int week,int time, int hours){
    	super();
    	this.id =id;
    	this.name =name;
    	this.week =week;
    	this.time =time;
    	this.hours =hours;   	
    }
    
   // public boolean isAvailable(int week ,int time){
		
    //	return avail ;
    	
   // }
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
