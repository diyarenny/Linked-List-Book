package application;

import dataStructures.LinkedList;

public class ListOfBooks {
	LinkedList<Book> list;
	
	public ListOfBooks(){
		list = new LinkedList<Book>();
	}
	
	public void inputBooks(){
		Book temp;
		
		for (int i = 1; i <= 3; i++)
		{
			
			temp = new Book(); //create a new integer object with value i + 1
			list.add(temp);
		}
	}
}
