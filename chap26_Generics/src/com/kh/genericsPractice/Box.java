package com.kh.genericsPractice;

public class Box<T> {
	T content;

	public void put(T item) {
		this.content = item;
	}

	public T get() {
		return content;
	}

}
