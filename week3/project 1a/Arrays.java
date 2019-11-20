package com.week3;

public class Arrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverse(arr);
		System.out.println(3/2);
	}

	public static void reverse(int[] arr) {
		for(int start = 0,end = arr.length-1; start<end;start++,end--) {
			int temp = arr[start];
			arr[start] = arr[end]; 
			arr[end] = temp;
		}
	}
}
