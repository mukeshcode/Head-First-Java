import java.util.*;

class Node {
    private int data;
    private Node next;
    private boolean empty;

    Node() {
        this.empty = true;
    }

    public void setData(int value) {
        this.data = value;
    }

    public void display(){
        System.out.print("List : ");
        Node temp = this;
        while(temp != null){
            System.out.print(temp.data + " > ");
            temp = temp.next;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public void add(int value) {
        if (this.empty) {
            this.data = value;
            this.empty = false;
        } else {
            Node newNode = this;
            while (newNode.next != null)
                newNode = newNode.next;
            newNode.next = new Node();
            (newNode.next).setData(value);
        }
        System.out.println(value + " added ... ");
    }

    public Node remove(int value) {
        Node curr = this;
        Node prev = null;
        while (curr != null) {
            if (curr.data == value) {
                if (curr == this) {
                    return this.next;
                } else {
                    prev.next = curr.next;
                }
                System.out.println(value + " removed ... ");
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        return this;
    }

}

class Menu {

    public void menu(Node node) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add\n2. Remove\n3. ExitCreatingSet\nChoose : ");
        while (true) {
            if(!node.isEmpty())
            node.display();
            switch (sc.nextInt()) {
                case 1 :
                    System.out.print("Enter value to add : ");
                    node.add(sc.nextInt());
                    break;
                case 2 : 
                    if(node.isEmpty())
                        System.out.println("List Empty ! ");
                    else{
                        System.out.print("Enter value to delete : ");
                        node = node.remove(sc.nextInt());
                    }
                    break;
                case 3 : 
                    break;
            }
        }
    }
}

public class LinkedSet {
    public static void main(String[] args) {
        Node list1 = new Node();
        Menu menu = new Menu();
        menu.menu(list1);
    }
}