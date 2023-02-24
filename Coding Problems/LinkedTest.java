class ListNode{
    int val;
    ListNode next;

    ListNode(){this.val = -5001; this.next = null;}
    ListNode(int val){this.val = val; this.next = null;}
    public void add(int val){
        if(this.val == -5001)
            this.val = val;
        else{
            ListNode temp = this;
            while(temp.next != null)
                temp = temp.next;
            temp.next = new ListNode(val);
        }
    }
    public void display(){
        ListNode temp = this;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

class Solution{
    public ListNode solution(ListNode current){
        ListNode temp, prev;

        temp = null;
        while(current != null){
            prev = temp;
            temp = current;
            current = current.next;
            temp.next = prev;
        }
        current = temp;
        return current;
    }
}

public class LinkedTest{
    public static void main(String[] args){
        ListNode list = new ListNode();

        list.add(10);  list.add(20); list.add(30); list.add(40);
        list.display();

        Solution sol = new Solution();
        ListNode revList = sol.solution(list);
        revList.display();
    }
}