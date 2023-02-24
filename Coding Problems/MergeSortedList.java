class Node{
    int val;
    Node next;
}

class ListNode{
    Node node;

    ListNode(){this.node = null;}

    public void add(int value){
        if(this.node == null){
            this.node = new Node();
            this.node.val = value;
            this.node.next = null;
        }
        else{
            Node temp = this.node;
            while(temp.next != null)
                temp = temp.next;

            temp.next = new Node();
            (temp.next).val = val;
        }
    }
    public void display(){
        Node node = this.node;
        while(node != null){
            System.out.print(node.val + " > ");
            node = node.next;
        }
        System.out.println();
    }
}

class Solution{
    public Node solution(ListNode list1, ListNode list2){
        Node head, temp;

        if(list1.value < list2.value){
            head = list1; list1 = list1.next;
        }
        else{
            head = list2; list2 = list2.next;
        }
        temp = head;
        while(list1 != null && list2 != null){
            if(list1.value < list2.value)
                temp.next = list1;
            else
                temp.next = list2;
            temp = temp.next;
        }
        while(list1 != null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        return head;
    }
}

public class MergeSortedList {
    public static void main(String[] args){
        ListNode list1 = new ListNode();
        ListNode list2 = new ListNode();

        list1.add(1); list1.add(3); list1.add(5); list1.add(8);
        list2.add(1); list2.add(5); list2.add(6); list2.add(7);

        // list1.display();
        // list2.display();

        Solution sol = new Solution();
        ListNode head = sol.solution(list1, list2);
        head.display();
    }
}
