
class LinkedNode{
    private Node node;

    LinkedNode(){this.node = null;}
    public void insert(int value){
        if(this.node == null){
            this.node = new Node();
            this.node.data = value;
            this.node.next = null;
        }
        else{
            Node temp = this.node;
            while(temp.next != null)
            temp = temp.next;
            temp.next = new Node();
            (temp.next).data = value;
            (temp.next).next = null;
        }
    }
    public void display(){
        Node temp = this.node;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;
}

public class LinkedMatrix{
    public static void main(String[] args){
        LinkedNode list1 = new LinkedNode();
        list1.insert(4);
        list1.insert(8);
        list1.insert(12);
        list1.insert(15);
        list1.display();
    }
}