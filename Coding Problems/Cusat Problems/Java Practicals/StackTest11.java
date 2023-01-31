import java.util.Scanner;
import java.util.ArrayList;

public class StackTest11{
	public static void main(String[] args){
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);

		while(true){
			stack.display();
			System.out.print("1. Push\n2. Pop\n3. IsEmpty\n4. Exit\nC H O O S E : ");
			int choice = sc.nextInt();

			switch(choice){
				case 1 :
					System.out.print("Enter the no. to push : ");
					stack.push(sc.nextInt());
					break;

				case 2 :
					if(stack.isEmpty())
						System.out.println("Empty Stack ! ");
					else
						System.out.println("Popped out : " + stack.pop());
					break;

				case 3 : 
					System.out.println("Is empty : " + stack.isEmpty());
					break;

				case 4 :
					System.exit(0);
		
				default : 
					System.out.println("Invalid input ! Try Again...!!");
			}			
		}
	}
}

class Stack{
	private ArrayList<Integer> stack;

	Stack(){stack = new ArrayList<Integer>();}

	public void push(int value){this.stack.add(0, value);}
	public int pop(){return this.stack.remove(0);}
	public boolean isEmpty(){return this.stack.isEmpty();}
	public int getSize(){return this.stack.size();}
	public void display(){System.out.println(this.stack);}
}