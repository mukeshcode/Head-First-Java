class ListNode{
    int val;
    ListNode next;

    ListNode(){this.val = -200; this.next = null;}

    public void add(int val){
        if(this.val == -200)
            this.val = val;
        else{
            ListNode temp = this;
            while(temp.next != null)    
                temp = temp.next;
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = val;
        }
    }
    public void display(){
        if(val == -200)
            System.out.println("");
        else{
            ListNode temp = this;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
}

class Solution{ 
    public ListNode solution(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val){
            list1.next = solution(list1.next, list2);
            return list1;
        }
        else{
            list2.next = solution(list2.next, list1);
            return list2;
        }
    
    }
}

public class ListNodeTest{
    public static void main(String[] args){
        ListNode list1 = new ListNode();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.print("List 1 : ");
        list1.display();

        ListNode list2 = new ListNode();
        list2.add(10);
        list2.add(11);
        list2.add(18);
        list2.add(29);
        System.out.print("List 2 : ");
        list2.display();

        Solution sol = new Solution();
        ListNode mergedList = sol.solution(list1, list2);
        System.out.print("Merged : ");
        mergedList.display();
    }
}