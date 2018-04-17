package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
    PrintStream out = new PrintStream("data.txt");
    out.println("Hsiang Han\t1\t1000");
    out.flush();
    out.close();
	}

}
