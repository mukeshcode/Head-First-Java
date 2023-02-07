import java.util.ArrayList;

class Node{
	int val;
	Node next;

	Node(int val){
		this.val = val;
		this.next = null;
	}
}

public class LinkedList{
	public static void main(String[] args){
		Node linked = new Node(5);
		linked.next = new Node(10);
		(linked.next).next = new Node(10);
		((linked.next).next).next = new Node(5);

		Node temp = linked;
		while(temp != null){
			System.out.println(temp.val);
			temp = temp.next;
		}

		Solution soln = new Solution();
		System.out.println(soln.isPalindrome(linked));
	}
}

class Solution{
	public boolean isPalindrome(Node head){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Node temp = head;
		while(temp != null){
			list.add(temp.val);
			temp = temp.next;
		}
		for(int i = 0, j = list.size() - 1; i<=j; i++, j--){
			if(list.get(i) != list.get(j))
				return false;
		}
		return true;
	}
}