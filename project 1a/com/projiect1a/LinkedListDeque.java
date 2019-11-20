package com.projiect1a;


public class LinkedListDeque <T> {
	
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
	    	add((T)other.get(i));
	    }
	}
	
	public void add(T x) {
		size +=1;
		IntNode temp = sentinel;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = new IntNode(x);
		temp.next.prev = temp;
	}
	
	public void remove() {
		if(sentinel.next == null) {
			return;
		}
		size -= 1;
		sentinel.next = sentinel.next.next;
		sentinel.next.next.prev = sentinel;
	}
	public T get(T x) {
		return sentinel.next.item;
	}
	public int size () {
		return size;
	}
}
