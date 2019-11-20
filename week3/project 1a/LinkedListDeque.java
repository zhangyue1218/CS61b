package com.week3;


public class LinkedListDeque<T> {
	
	private IntNode sentinel;
	private int size = 0;
	
	public class IntNode {
		public IntNode prev;
        public T item;
        public IntNode next;
		
		public IntNode(T i) {
			item = i;
		}
	}
	public LinkedListDeque() {
		sentinel = new IntNode(null);
		sentinel.prev = sentinel;
		sentinel.next = sentinel;
	    size = 0;
	}
	
	public LinkedListDeque(LinkedListDeque other) {
		sentinel = new IntNode(null);
		sentinel.prev = sentinel;
		sentinel.next = sentinel;
	    size = 0;
	    for(int i = 0; i < other.size(); i++) {
	    	addFirst((T)other.get(i));
	    }
	}
	
	public void addLast(T x) {
		size +=1;
		IntNode temp = sentinel;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new IntNode(x);
		temp.next.prev = temp;
	}
	
	public void addFirst(T x) {
		size +=1;
		IntNode temp = sentinel;
		temp.next = new IntNode(x);
		temp.next.prev = temp;
	}
	
	public T removeLast() {
		if(sentinel.next == null) {
			return null;
		}
		IntNode temp = sentinel;
		while(temp.next != null) {
			temp = temp.next;
		}
		size -= 1;
		T res = temp.item;
		temp.prev.next = null;
		return res;
		
	}
	
	public T removeFirst() {
		if(sentinel.next == null) {
			return null;
		}
		size -= 1;
		T res = sentinel.next.item;
		sentinel.next = sentinel.next.next;
		if(size == 0) {
			sentinel.prev = sentinel;
			return res;
		}
		sentinel.next.prev = sentinel;
		return res;
	}
	
	public T get(int x) {
		IntNode temp = sentinel;
		for(int i = 0; i<x; i++) {
			temp = temp.next;
		}
		return temp.item;
	}
	
	public int size () {
		return size;
	}
	public void printDeque() {
		for (int i =0; i<size ; i++) {
			System.out.print(get(i)+"->");
			System.out.println(" ");
		}
	}
	public boolean isEmpty() {
		return size==0;
	}
	/*public static void main(String[] args) {
		LinkedListDeque<String> lld1 = new LinkedListDeque<String>();
		boolean a = lld1.isEmpty();
		System.out.println(a);
	}*/
}
