import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(){this.val = -1; this.next = null;}
    ListNode(int val){this.val = val; this.next = null;}

    public void add(int val){
        if(this.val == -1)
            this.val = val;
        else{
            ListNode temp = this;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new ListNode(val);
        }
    }

    public void display(){
        ListNode list = this;
        while(list != null){
            System.out.print(list.val + " ");
            list = list.next;
        }
    }
}

class Solution{
    public ListNode detectCycle(ListNode head){
        HashSet<ListNode> myHashSet = new HashSet<ListNode>();

        while(head != null){
            if(myHashSet.contains(head))
                return head;
            myHashSet.add(head);
            head = head.next;
        }
        return head;
    }
}

public class LinkedCycleTest {
    public static void main(String[] args){
        ListNode list = new ListNode();
        list.add(10); list.add(20); list.add(29); list.add(40);
        list.display();


    }
}
