package com.java2.schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleText {
    int total =0;  
    List<Course> courses = new ArrayList<>();
    
    public void pickCourse(){
		System.out.println("Please enter course number: ");
		for (int i=0;i<courses.size();i++){
			Course course =courses.get(i);
			System.out.println(course.getId()+"\t"+course.getName()+"\t"+course.getWeek()+"\t"+course.getTime()+"\t"+course.getHours());			
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
