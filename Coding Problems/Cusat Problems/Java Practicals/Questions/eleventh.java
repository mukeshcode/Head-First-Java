import java.util.Scanner;
import java.util.ArrayList;

class Stack{
    private ArrayList<Integer> stack;
    private int size;

    Stack(){this.stack = new ArrayList<Integer>(); size = 0;}

    public void displayStack(){
        System.out.println("Stack " + this.stack);
    }
    public void push(int value){
        stack.add(value);
        this.size++;
        System.out.println(value  + "pushed");
    }
    public int pop(){
        this.size--;
        int value = this.stack.remove(this.size);
        return value;
    }
    public int peek(){
        return stack.get(size-1);
    }
    public boolean is_Empty(){
        return stack.isEmpty();
    }
}

class StackTest {
    public static void main(String[] args){
       Stack stack = new Stack();
       Scanner sc = new Scanner(System.in);

       while(true){
        stack.displayStack();
        System.out.print("1.Push\n2.Pop\n3.Peek\n4.Exit\nCHOOSE : ");
        switch(sc.nextInt()){
            case 1 :
                System.out.print("Enter element to push : ");
                stack.push(sc.nextInt());
                break;

            case 2 :
                if(!stack.is_Empty()){
                    int elem = stack.pop();
                }else{System.out.println("Empty Stack ! ");}
                break;

            case 3  :
                if(stack.is_Empty())
                    System.out.println("Empty Stack ! ");
                else System.out.println("Peek :" + stack.peek());
                break;

            case 4 : 
                System.exit(0);

            default :
                System.out.println("Invalid Choice ! ");
        }
       }
       
    }
}
