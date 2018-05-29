package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class SnowTexter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Snow> snows =new ArrayList<>();
        for(int i=0;i<100;i++){
		    Snow snow =new Snow();
		    snow.start();
		    snows.add(snow);
		}
	}

}