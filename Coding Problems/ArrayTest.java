import java.util.ArrayList;
import java.util.Scanner;

class Queue{
	private ArrayList<Integer> myList;

	Queue(){this.myList = new ArrayList<Integer>();}

	public void enqueue(int value){
		this.myList.add(value);
	}

	public int dequeue(){
		return this.myList.remove(0);
	}
	public boolean is_empty(){
		return this.myList.isEmpty();
	}
	public void display(){
		System.out.println("MyList : " + this.myList);
	}
	
}

public class ArrayTest{
	public static void main(String[] args){
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
		int value;
		while(true){
			q.display();
			System.out.print("1. Enqueue\n2. Dequeue\n3. Exit\nChOOSe : ");
			int ch = sc.nextInt();
			switch(ch){
				case 1 :
					System.out.print("Enter value to enqueue : ");
					value = sc.nextInt();
					q.enqueue(value);
					break;
				case 2 : 
					if(q.is_empty())
						System.out.println("Queue Underflow !  ");
					else{
						value = q.dequeue();
						System.out.println(value + " dequeued ... ");
					}
					break;
				case 3 : 
					System.exit(0);
				default : 
					System.out.println("INvalid choice ! ");
			}
		}		
	}
}