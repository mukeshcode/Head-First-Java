import java.util.ArrayList;
import java.util.Scanner;

class Queue{
    ArrayList<Integer> queue;

    Queue(){queue = new ArrayList<Integer>();}

    public void enqueue(int value){
        this.queue.add(value);
        System.out.println("Value : " + value + " enqueued...");
    }
    public int dequeue(){
        int value = -1;
        if(queue.isEmpty())
            System.out.println("Queue Empty ! ");
        else{
            value = queue.remove(0);
            System.out.println("Value : " + value + " dequeued");
        }
        return value;
    }
    public void displayQ(){
        System.out.println("Queue : " + this.queue);
    }
}

class QueueTest {
    public static void main(String[] args){
        Queue q = new Queue();
        Scanner sc = new Scanner(System.in);

        while(true){
            q.displayQ();
            System.out.print("1. Enqueue\n2. Dequeue\n3. Exit\nC H O O S E : ");
            switch(sc.nextInt()){
                case 1 : 
                    System.out.print("Enter element to enqueue : ");
                    q.enqueue(sc.nextInt());
                    break;

                case 2 : 
                    int elem = q.dequeue();
                    break;
                case 3 : 
                    System.exit(0);
                default : 
                    System.out.println("INVALID CHOICE ! ");
            }
        }
    }
}
