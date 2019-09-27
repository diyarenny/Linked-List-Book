package dataStructures;

//This class implements the ADT definition of a linked list using the same signatures. Note that we can add extra methods
//here once all of the methods listed in the ADT interface are included.

public class LinkedList<T> implements LinkedListADT<T> {
	
	 private int count;  // the current number of elements in the list
	 private LinearNode<T> list; //pointer to the first element 
	 private LinearNode<T> last; //pointer to the last element 
	 
	 //-----------------------------------------------------------------
	 //  Creates an empty list.
	 //-----------------------------------------------------------------
	    public LinkedList()
	    {
	       this.count = 0;
	       this.last = null;
	       this.list = null;
	    }

	    
	 //  Adds one element to the end of this list
	   public void add (T element)
	   {      
		   
		   LinearNode<T> node = new LinearNode<T> (element); 
       
		   if (size() == 0) {  
			   	this.last = node; // This is the last and the 
			 	this.list = node; // first node
			 	this.count++;
		   }//end if
		   else
		  { 
				last.setNext(node); // add node to the end of the list
				last = node; // now make this the new last node.
				count++;   
		  }     
		  
		   /*
		   LinearNode<T> node = new LinearNode<T> (element); 
	       
		   if (size() == 0) {  
			   	this.last = node; 
			 	this.last = node; 
			 	this.count++;
		   }
		   else
		  { 
				list.setNext(node); 
				list = node; 
				count++;   
		  }    
		  */
	   }
	   

	   //  Removes and returns the first element from this list
	
	public T remove()
	   {
		   T result = null;
			if (isEmpty()) {
				System.out.println("There are no nodes in the list");
			}//end if
			else {
				result = this.list.getElement();
				this.list = this.list.getNext();
				count--;
			}//end else
			return result;

	   }
	
	public void remove(T element)
	   {
		LinearNode<T> current = list;
		LinearNode<T> previous = list;
		while(!current.getElement().equals(element) && current != null){
			previous = current;
			current = current.getNext();
		}
			if(current != null){
				if(current == list){
					list = current.getNext();
					current.setNext(null);
				}
				else if(current == last){
					last = previous;
					last.setNext(null);
				}
				else{
					previous.setNext(current.getNext());
				}
			}
	   }

	  
	   
	   //  Returns true if this list contains no elements
	   public boolean isEmpty()
	   {
		   if (this.list == null)
			   return true;
		   else
			   return false;
	   }

	   //  Returns the number of elements in this list
	   public int size()
	   {
		   return this.count;
	   }
	   
	   
	   public boolean contains(T element){
		   LinearNode<T> current;
		   boolean found = false;
		   for(current = list; current != null; current = current.getNext()){
			   if(current.getElement().equals(element)){ 
					   found = true; 
			   }   
		   }
			   return found;
	   }

	   //  Returns a string representation of this list
	  
	public String toString()
	   {
		   LinearNode<T> current = this.list;
		   String fullList = "";
		   
		   for (current = this.list; current != null; current = current.getNext())
		   {
			   fullList = fullList + "\n" + current.getElement().toString();
		   }//end for
		   
		   return fullList + "\n";
	   }
}
