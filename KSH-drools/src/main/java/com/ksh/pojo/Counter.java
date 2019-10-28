package com.ksh.pojo;

public class Counter {
	private String name;
	private int count;

	public Counter(String name, int count) {
		System.out.println("Creating new using overloaded constructor");
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
