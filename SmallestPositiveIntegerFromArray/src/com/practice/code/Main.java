package com.practice.code;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array to insert: \n");
		int arrLength = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the elements of array: \n");
		int[] arr = new int[arrLength];
		for(int i=0; i<arrLength; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		int result = solution(arr);
		System.out.println("The smallest integer is : "+result);
	}
	public static int solution(int[] A) {
        // Implement your solution here
        int smallestInteger = 1;
        Arrays.sort(A);
        for(int num : A) {
            if(num > 0) {
                if(smallestInteger == num) smallestInteger = num+1;
            }
        }
        return smallestInteger;
    }
}
