package com.week3;

public class Alist implements List61B{
	private int[] items;
	private int size;

	public Alist() {
		items = new int[100];
		size = 0;
	}

	public void resize(int capacity) {
		if (size == items.length) {
			int[] a = new int[capacity];
			System.arraycopy(items, 0, a, 0, size);
			items = a;
		}
	}

	public void addLast(int x) {
		if (size == items.length) {
			resize(size + 1);
		}
		items[size] = x;
		size += 1;
	}

	public int getLast() {
		return items[size - 1];
	}

	public int get(int i) {
		return items[i];
	}

	public int size() {
		return size;
	}

	public int removeLast() {
		int x = getLast();
		size = size - 1;
		return x;
	}
	
	public int getFirst() {
		return get(0);
	}
}
