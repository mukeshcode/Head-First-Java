import java.util.*;

class Stack{
    private ArrayList<Integer> stack;

    Stack(){this.stack = new ArrayList<Integer>();}

    public void push(int value){ this.stack.add(0, value); }
    public int pop(){ return this.stack.remove(0);}
    public void display(){ System.out.println("STACK : " + this.stack);}
    public boolean isEmpty(){return this.stack.isEmpty();}
}

public class StackTest{
    public static void main(String[] args){
        Stack myStack = new Stack();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("1. PUSH\n2. POP\n3. DISPLAY\n4. EXIT\nChoose : ");
            switch(sc.nextInt()){
                case 1 : 
                    System.out.print("Enter number to push : ");
                    myStack.push(sc.nextInt());
                    System.out.println("Element pushed ... ");
                    break;

                case 2 : 
                    if(myStack.isEmpty())
                        System.out.println("Stack UNDERFLOW ! ");
                    else{
                        int value = myStack.pop();
                        System.out.println(value + " popped ... ");
                    }
                    break;

                case 3 : 
                    if(myStack.isEmpty())
                        System.out.println("Stack EMPTY ! ");
                    else
                        myStack.display();
                    break;
                
                case 4 : 
                    System.exit(0);

                default : 
                    System.out.println("INVALID CHOICE !");
            }
        }
    }
}