package com.run.java;

import java.util.Scanner;

public class SimpleRun {
    static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int count = sc.nextInt();
		int first=0;
		int second=0;
		int[] num = new int[count];
		for(int i=0;i<num.length;i++){
			num[i]=sc.nextInt();
		}
		for(int i=0;i<num.length;i++){
			if(first<num[i]){
				second=first;
				first=num[i];
				
			}
		}
		System.out.println(" "+second);
		
	}

}
