package com.example.springboot.demo.controller;

public class Books {

	private int bookid;
	private String name;
	
	public Books() {
		
	}

	public Books(int bookid, String name) {
		
		this.bookid = bookid;
		this.name = name;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
