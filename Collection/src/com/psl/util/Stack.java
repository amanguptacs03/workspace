package com.psl.util;

public class Stack<T> {  //T---->generic typr

	private int top, size;
	private T data[];  //to make it universal for all --->OBJECT

	public Stack(int size) {
		super();
		this.size = size;
		//data = new Object[size]; CTE
		//data = new T[size]; CTE
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void push(T s) {
		

	}

	public T pop() {
		return null;
	}

	public T peek() {
		return null;
	}

}