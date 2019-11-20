package com.projiect1a;

public class ArrayDeque {
	int size;
	int nextFirst;
	int nextLast;
	int[] arr;
	
	public ArrayDeque(int first,int last) {
		size = 0;
		nextFirst = first;
		nextLast=last;
	    arr = new int[8];
	}
	
	public ArrayDeque(ArrayDeque other) {
		arr = new int[other.size];
		for(int i = 0; i< other.size; i++) {
			arr[i]= other.arr[i];
		}
	}
	public void addFirst(int x) {
		    size++;
			arr[nextFirst] = x;
			if (nextFirst == 0) {
				nextFirst = 7;
			}
			nextFirst--;
	}
	
	public void addLast(int x) {
		size++;
		arr[nextLast] = x;
		if(nextLast == 7) {
			nextLast = 0;
		}
		nextLast ++;
	}
	
	public int size() {
		return size;
	}
	
	public int get(int x) {
		return arr[x];
	}
}
