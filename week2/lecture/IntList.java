package com.java.week2;

public class IntList {
	public int first;
	public IntList rest;
	//构造函数
	public IntList(int f,IntList r) {
		first = f;
		rest = r;
	}
	public int size() {
		if(rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}
	/** return the size of the list using no recursion*/
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while(p!= null) {
			totalSize+=1;
			p = p.rest;
		}
		return totalSize;
	}
	/**return the ith item of this Intlist*/
	public int get(int i) {
		if(i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}
	public static void main(String[] args) {
		IntList L =new IntList(15,null); 
		L = new IntList(10,L);
		L = new IntList(5,L);
		System.out.println(L.iterativeSize());
		System.out.println(L.get(0));
	}
}
