package linkedlist;

public class LinkedList {
	//Properties
	Node head;
	int count;
	
	//constructors
   public LinkedList(){
		head = null;
		count = 0; 
	}
	
	public LinkedList(Node newHead){
		 head = newHead;
		 count = 1;
	}
	
	//methods 
	
	//add
	public void add(int newData){
		 Node temp = new Node(newData);
		 if (count == 0) {
		    head = temp;
		    count++;
		    return;
		 }
		 
		 Node last = head;
		 while(last.getNext() != null){
			 last = last.getNext();
		 }
		 last.setNext(temp);
		 count++;
	}
	
	//get
	public int get(int index){  // throws IndexOutOfBoundsException 
		
		if (index <= 0 || index > count)
			throw new IndexOutOfBoundsException("out of range");

		Node last = head;
		for(int i = 1; i<index; i++){
			last = last.getNext();
		}
		return last.getData();
	} 
	
	
	// remove ith element
	
	public void remove(int index) throws UnsupportedOperationException {
		
		if (index <= 0 || index > count)
			throw new IndexOutOfBoundsException("out of range");
		
		if (count == 0 )
			throw new UnsupportedOperationException("remove from empty list");
		
		if (index == 1)
			head = head.getNext();
		
		else{
			Node beforeIndex = head;
			for(int i = 1; i<index-1; i++){
				beforeIndex = beforeIndex.getNext();
			}
			beforeIndex.setNext(beforeIndex.getNext().getNext());
		}
		count--;
	}
	
	//getElement
	
	public int getElement(int index){  // throws IndexOutOfBoundsException 
		
		if (index <= 0 || index > count)
			throw new IndexOutOfBoundsException(index+ " is out of range of " +count);

		Node last = head;
		for(int i = 1; i<index; i++){
			last = last.getNext();
		}
		return last.getData();
	} 
	
  //size
	
	public int size(){
		 return count;
	}
	
	//isEmpty
	public boolean isEmpty(){
		return  head == null; 
	} 
	

	//Swap
	public void swapNodes(int x, int y){
		//if x == y we do nothing--
		if(x == y){
			return;
		}
		//search for 'x' in the list--
		
		Node prevX = null;
		Node currX = head;
		while(currX !=null && currX.getData() != x){
			prevX = currX;
			currX = currX.getNext();
		}
		
		//Similarly search for 'y' in the list---
		
		Node prevY = null;
		Node currY = head;
		while(currY != null && currY.getData() != y){
			prevY = currY;
			currY = currY.getNext();
		}
		
		//if 'x' and 'y' both are not there in the list--
		
		if(currX == null ||  currY == null){
			return;
		}
		
		//if 'x' is not head of linked list---
		
		if(prevX != null){
			prevX.setNext(currY);
		}
		else 
			head = currY;

		//if 'y' is not the head of linked list---
		
		if(prevY != null){
			prevY.setNext(currX);
		}
		else
			head = currX ;
		
		//swap the pointers----

		Node temp = currY.getNext();
		currY.setNext(currX.getNext());
		currX.setNext(temp);
	}
	  
	 //remove
	
	public void remove() throws UnsupportedOperationException{
	
		if (count == 0 )
			throw new UnsupportedOperationException("remove from empty list");
		if (count == 1)
			head = null;
		else{
			Node secondLast = head;
			while(secondLast.getNext().getNext() != null){
				secondLast = secondLast.getNext();
			}
			secondLast.setNext(null);
		}
		count--;
	}
	
	
}
  
		
    
