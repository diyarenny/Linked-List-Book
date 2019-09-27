package application;

import java.util.Scanner;

import dataStructures.*;

public class BookShelfLinked {
	
	
	LinkedList<Book> list;
	
	final int capacity = 3;
	
	Scanner sc = new Scanner(System.in);
	
	public BookShelfLinked(){
	list = new LinkedList<Book>();	
	
	for(int i=0; i<3; i++){
		
		addABook(i);
	}
	
	System.out.println();
	System.out.println("The books are");
	displayBooks();
	
	removeBook();
	System.out.println("After removal, books are: ");
	displayBooks();
  }
	public void addABook(int i){
		Book aBook = new Book();
		String title,author;
		int year;
		
		if(i < capacity){
			System.out.println("Title: ");
			title = sc.next();
			System.out.println("Author: ");
			author = sc.next();
			System.out.println("Year: ");
			year = sc.nextInt();
			aBook =new Book(title, author, year);
			//list.add(aBook);
			//System.out.println(list.contains(aBook));
			//removeABook(aBook);
		}
		
			
		while(list.contains(aBook) == true){
			System.out.println("Book already in list");
			addABook(i);
			if(list.contains(aBook) == false)
				list.add(aBook);
			break;
		}
		
		if(list.contains(aBook) == false)
			list.add(aBook);
			 
			
	}
	public void displayBooks(){
		System.out.println(list.toString());
	}
	
	public void removeBook() {
	Book aBook;
	if (!list.isEmpty())
	{
		aBook = list.remove();
		System.out.println(aBook.getTitle() + " has been deleted");
	}
	else
		System.out.println("There are no values to delete");
	
	}
	
	public void removeABook(Book aBook) {
		if (!list.isEmpty())
		{
			//System.out.println("Title: ");
			//String title = sc.nextLine();
			
			aBook = list.remove();
			System.out.println(aBook.getTitle() + " has been deleted");
		}
		else
			System.out.println("There are no values to delete");
		
		}
		 
		public static void main(String[] args) {
		new BookShelfLinked();
		} 
	
}
