package com.practice.code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive integer to find the binary Gap: \n");
		String input = sc.nextLine();
		int result= solution(Integer.parseInt(input));
		System.out.println("The result is : "+result);

	}
	public static int solution(int N) {
	     // Implement your solution here
	     String bin= Integer.toBinaryString(N);
	     int binaryGap=0;
	     int cnt = 0;
	     boolean foundOne = false;
	     for(int i=1; i<bin.length(); i++) {
	         if(bin.charAt(i)=='0') {
	             cnt++;
	             foundOne = false;
	         }
	         else {
	             foundOne = true;
	             if(cnt > binaryGap) binaryGap = cnt;
	             cnt=0;
	         }
	     }
	     return binaryGap;
	 }

}
