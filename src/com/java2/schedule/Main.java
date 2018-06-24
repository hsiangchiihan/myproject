package com.java2.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.java2.oo.Drink;

/* 有一文字檔儲存課表資料(schedule.txt)
       請讀取資料後，設計程式可檢查是否有空檔
       如:
       請輸入星期(1-7):2
       請輸入時(0-24):11
   [有空檔]
       請輸入星期(1-7):4
       請輸入時(0-24):14
   [有課: C004 English 到16時]
*/
public class Main {	
    public Main(){
    	List<Course> courses = new ArrayList<>();//目前還無法共用同一個List
    	readCourses();
    	Scanner sc =new Scanner(System.in);
    	System.out.println("請輸入星期(1-7):");
    	int week =sc.nextInt();
    	System.out.println("請輸入時(0-24):");
    	int time =sc.nextInt();
    	boolean avail =true;
    	for(Course c : courses){
    		if(!c.isAvailable(week, time)){
    			System.out.println("[有課:"+c.getId()+" "+c.getName()+ (c.getTime()+c.getWeek())+"時]");
    			
    		}    		
    	}    	
    }

	public void readCourses(){
		ScheduleText st =new ScheduleText();
	   try {
		FileReader fr =new FileReader("schedule.txt");
		BufferedReader in =new BufferedReader(fr);
		String line =in.readLine();
		System.out.println("請輸入星期(1-7):");
		Scanner s1 =new Scanner(System.in);
		int w =s1.nextInt();
		System.out.println("請輸入時(0-24)");
		Scanner s2 =new Scanner(System.in);
		int t =s2.nextInt();
		
		for(int i=0;i<line.length();i++){
			line =in.readLine();
		    String[] tokens =line.split(",");
		    String id =tokens[0];
		    String name =tokens[1];
		    int week =Integer.parseInt(tokens[2]);
		    int time =Integer.parseInt(tokens[3]);
		    int hours =Integer.parseInt(tokens[4]);
		    Course c =new Course(id,name,week,time,hours);
		
		if(c.week == w){
			if(c.time <= t &&t <=(c.time+c.hours)){
				System.out.println("[有課:" + id + " " + name + " 到" + (time + hours) + "時]");
				break;
			}else{
				System.out.println("[有空檔]");
				break;
			}
		}
		st.courses.add(new Course(id,name,week,time,hours));
		}
		st.pickCourse();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ScheduleText st =new ScheduleText();
		Main m =new Main();
		m.readCourses();
	}
}
