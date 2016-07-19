package linkedlist;

import java.util.Scanner;

public class FirstLinkedList {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		LinkedList ll = new LinkedList();
		
		int option = 0;
		do{
			System.out.println("Select an option:");
			System.out.println("1) add an element");
			System.out.println("2) remove last element");
			System.out.println("3) remove ith element");
			System.out.println("4) print all element");
			System.out.println("5) print ith elements");
			System.out.println("6) swap the values of Node:");
			System.out.println("7) exit");
			option = sc.nextInt();
			
			switch(option){
			case 1: 
				System.out.println("Enter an element to add: ");
				int tmp = sc.nextInt();
				ll.add(tmp);
				break;
			case 2: 
				try{
					ll.remove();
				}
				catch(UnsupportedOperationException e){
					System.out.println("Error: Trying to remove from empty list.");
				}
				break;
			case 3: 
				System.out.println("Enter the index of element to remove: ");
				int index = sc.nextInt();
				ll.remove(index);
				break;
			case 4: 
				int size = ll.size();
				System.out.print("[ ");
				for(int i=1; i<=size; i++){
					System.out.print(ll.get(i));
					if( i != size)
						System.out.print(", ");
				}
				System.out.println(" ]");
				break;
			case 5:
				
				System.out.println("Enter the index to get the element: ");
                int idx = sc.nextInt();
                int x = ll.getElement(idx);
                System.out.println(x);
                break;
            case 6:
            	System.out.println("Enter the First and second element to swap: ");
            	int p= sc.nextInt();
            	int q = sc.nextInt();
            	ll.swapNodes(p, q);
            				
		}
	}		
			while(option != 7);
	
		
	}
}
