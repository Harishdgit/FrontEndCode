package com.run.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyEach {
    static Scanner sc;
	public static void main(String[] args) {
		 sc = new Scanner(System.in);
		 String Sentence = sc.nextLine();
		 int len=Sentence.length();
		 String[] words = Sentence.split("\\s+");
		 
		 System.out.println(len+" "+words.length);
		Map<Integer,String> count = new HashMap<Integer,String>();
		
		

	}

}
