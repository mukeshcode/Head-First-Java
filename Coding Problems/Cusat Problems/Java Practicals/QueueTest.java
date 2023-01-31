import java.util.Scanner;
import java.util.ArrayList;

public class QueueTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		while(true){
			q.display();
			System.out.print("1. Enqueue\n2. Dequeue\n3. IsEmpty\n4. Quit\nC H O O S E : " );
			int choice = sc.nextInt();
	
			switch(choice){
				case 1 : 
					System.out.print("Enter your no. to enqueue : ");
					q.enqueue(sc.nextInt());
					break;

				case 2 :
					if(q.isEmpty())
						System.out.println("Queue Empty ! ");
					else
						System.out.println("Dequeued no . : " + q.dequeue());
					break;

				case 3 : 
					System.out.println("Is empty : " + q.isEmpty());
					break;

				case 4 : 
					System.exit(0);
					break;

				default : 
					System.out.println("Invalid choice ! Try again...!");	 
			}
		}
	}
}

class Queue{
	private ArrayList<Integer> queue;

	Queue(){queue = new ArrayList<Integer>();}

	public void enqueue(int num){this.queue.add(num);}
	public int dequeue(){return this.queue.remove(0);}
	public boolean isEmpty(){return this.queue.isEmpty();}
	public void display(){System.out.println(this.queue);}
}