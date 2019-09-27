package application;

import dataStructures.*;

public class Book {
	
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	
	public Book() {
		this.title = "";
		this.author = "";
		this.year = 0;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean equals(Object otherObject)
	{
		Book otherBook = (Book) otherObject;
		return this.title.equals(otherBook.getTitle()) && this.author.equals(otherBook.getAuthor())
				&& this.year == (otherBook.getYear());
	}
	
	
	public String toString() {
		return "The book " + title + " was written by " + author + " in " + year;
	}
}