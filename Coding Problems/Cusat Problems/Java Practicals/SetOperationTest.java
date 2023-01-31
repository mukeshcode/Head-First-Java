import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class SetOperationTest{
	public static void main(String[] args){
		Set s1 = new Set();
		s1.makeSet();

		Set s2 = new Set();
		s2.makeSet();

		s1.display();
		s2.display();

		s1.setUnion(s2);
		s1.setIntersection(s2);
		s1.setDifference(s2);
	}
}

class Menu{
	int display(){
		Scanner sc = new Scanner(System.in);
		System.out.print("1. Insert\n2. Delete\n3. Exit\nC H O O S E : ");
		return(sc.nextInt());
	}
}

class Set{
	private ArrayList<Integer> set;

	Set(){set = new ArrayList<Integer>();}

	void insert(int value){this.set.add(value);Collections.sort(set);}

	void delete(int value){
		if(this.set.contains(value))
			this.set.remove(Integer.valueOf(value));
		else
			System.out.println("Value not present in the set ! ");
	}

	boolean isEmpty(){return this.set.isEmpty();}

	void makeSet(){
		Menu m1 = new Menu();
		Scanner sc = new Scanner(System.in);
		label : 
		while(true){
			System.out.println(this.set);
			int choice = m1.display();
			switch(choice){
				case 1 :
					System.out.print("Enter a number to insert : ");
					this.insert(sc.nextInt());
					break;
				case 2 :
					if(this.set.isEmpty())
						System.out.println("Set Empty ! ");
					else{
						System.out.println("Enter a number to delete : "); 
						this.delete(sc.nextInt());
					}
					break;
				case 3 : 
					break label;
				default : 
					System.out.println("Invalid Choice ! Try again ... !!\n");
			}
		}
		System.out.println("Finished making the set ! ");
	}

	ArrayList<Integer> getSet(){return this.set;}

	void setUnion(Set s2){
		ArrayList<Integer> set2 = s2.getSet();
		int i, j;
		System.out.print("SET UNION : ");
		for(i = 0, j = 0; i<this.set.size() && j < set2.size();){
			if(this.set.get(i) < set2.get(j)){
				System.out.print(this.set.get(i) + "\t");
				i++;
			}
			else if(this.set.get(i) > set2.get(j)){
				System.out.print(set2.get(j) + "\t");
				j++;
			}
			else{
				System.out.print(this.set.get(i) + "\t");
				i++;j++;
			}
		}
		
		while(i<this.set.size()){
			System.out.print(this.set.get(i) + "\t");
			i++;
		}
		while(j < set2.size()){
			System.out.print(set2.get(j) + "\t");
			j++;
		}
		System.out.println();
	}
	
	void setIntersection(Set s2){
		ArrayList<Integer> set2 = s2.getSet();
		System.out.print("SET INTERSECTION : ");
		
		int i, j;
		for(i = 0, j = 0; i<this.set.size() && j < set2.size(); ){
			if(this.set.get(i) < set2.get(j))
				i++;
			else if(this.set.get(i) > set2.get(j))
				j++;
			else{
				System.out.print(set2.get(j) + "\t");
				i++; j++;
			}
		}
		System.out.println();
	}

	void setDifference(Set s2){
		ArrayList<Integer> set2 = s2.getSet();
		int i, j;	
		System.out.print("SET DIFFERENCE : ");
		for(i = 0, j = 0; i<this.set.size() && j<set2.size();){
			if(this.set.get(i) < set2.get(j)){
				System.out.print(this.set.get(i) + "\t");
				i++;
			}
			else if(this.set.get(i) > set2.get(j)) j++;
			else{ i++; j++;}
		}
		if(i < this.set.size()){
			System.out.print(this.set.get(i) + "\t");
			i++;
		}
		System.out.println();
	}

	void display(){System.out.println(this.set);}
}