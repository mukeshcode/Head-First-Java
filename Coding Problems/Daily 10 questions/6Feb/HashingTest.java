import java.util.Scanner;

class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
		this.next = NULL;
	}
}
class HashTable{
	Node[] myHashTable;
	int m;

	HashTable(int bucketSize){
		this.m = bucketSize;
		myHashTable = new Node[m];
	}
	Node createNode(int value;){
		Node node = new Table();
		return node;
	}
}

public class HashingTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int bucketSize;
		System.out.println("Enter the size of the hash table : ");
		bucketSize = sc.nextInt();
	
		int ch;
		HashTable hashTable = new HashTable(bucketSize);
		/*
		while(true){
			System.out.println("1. Insert\t2. Search\n3. Delete\n4. Display\nC H O O S E : ");
			ch = sc.nextInt();
			switch(ch){
				case 1 : 
					System.out.print("Enter the number : ");
					int value = sc.nextInt();
					int index = value % bucketSize;
					Node temp = hashTable.createNode(value);
					Node indexNode = hashTable.myHashTable[index];
					while()
			}
		}
		*/
	}
}