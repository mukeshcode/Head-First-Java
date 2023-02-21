import java.util.*;

class Set{
    private ArrayList<Integer> list;

    Set(){
        list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        label : 
        while(true){
            this.list.sort(Comparator.naturalOrder());
            this.display();
            System.out.print("1. Insert\n2. Delete\n3.Quit making set\nChoose : ");
            switch(sc.nextInt()){
                case 1 : 
                    System.out.print("Enter element to insert : ");
                    this.list.add(sc.nextInt());
                    break;

                case 2 :
                    if(this.list.isEmpty())
                        System.out.println("List empty ! ");
                    else{
                        System.out.print("Enter element to delete : ");
                        int value = sc.nextInt();
                        if(!this.list.contains(value))
                            System.out.println(value + " not found !");
                        else{
                            for(int i = 0; i<this.list.size(); i++)
                                if(this.list.get(i) == value){
                                    this.list.remove(i);
                                    break;
                                }
                        }
                    }
                    break;

                case 3 :
                    break label;

                default : 
                    System.out.println("Invalid Choice ! ");
            }
        }
    }

    public void union(Set s2){
        int i, j;
        for(i = 0, j = 0; i<this.list.size() && j<this.list.size();){
            if(this.list.get(i) < s2.list.get(j)){
                System.out.print(this.list.get(i) + " ");
                i++;
            }
            else if(s2.list.get(j) < this.list.get(i)){
                System.out.print(s2.list.get(j) + " ");
                j++;
            }
            else{
                System.out.print(this.list.get(i) + " ");
                i++; j++;
            }
        }

        while(i < this.list.size()){
            System.out.print(this.list.get(i) + " ");
            i++;
        }
        while(j < s2.list.size()){
            System.out.print(s2.list.get(j) + " ");
            j++;
        }
    }

    public void intersection(Set s2){
        for(int i = 0, j = 0; i<this.list.size() && j<s2.list.size();){
            if(this.list.get(i) < s2.list.get(j))
                i++;
            else if(this.list.get(i) > s2.list.get(j))
                j++;
            else{
                System.out.print(this.list.get(i) + " ");
                i++; j++;
            }
        }
    }

    public void difference(Set s2){
        int i, j;
        for(i = 0, j = 0; i<this.list.size() && j<s2.list.size(); ){
            if(this.list.get(i) < s2.list.get(j)){
                System.out.print(this.list.get(i) + " ");
                i++;
            }
            else if(s2.list.get(j) < this.list.get(i))
                j++;
            else{
                i++; j++;
            }
        }

        while(i < this.list.size()){
            System.out.print(this.list.get(i) + " ");
            i++;
        }
    }

    public void display(){System.out.println("SET : " + this.list);}
}

public class SetTest {
    public static void main(String[] args){
        Set s1 = new Set();
        Set s2 = new Set();


        s1.display();
        s2.display();
        System.out.print("\nUNION : ");
        s1.union(s2);
        System.out.print("\nINTERSECTION : ");
        s1.intersection(s2);
        System.out.print("\nDIFFERENCE : ");
        s1.difference(s2);
    }
}
