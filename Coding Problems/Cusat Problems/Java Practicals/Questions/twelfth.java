import java.util.Scanner;
import java.util.ArrayList;

class MySet {
    ArrayList<Integer> set;

    MySet() {
        this.set = new ArrayList<Integer>();
    }

    public void insert(int value) {
        int i;
        for (i = 0; i < this.set.size() && value > this.set.get(i); i++)
            ;
        this.set.add(i, value);
    }

    public void delete(int value) {
        if (this.set.contains(value)) {
            System.out.println("deleted");
            this.set.remove(this.set.indexOf(value));
            System.out.println(value + " deleted ... ");
        } else
            System.out.println("Element not found ! ");
    }

    public boolean is_Empty() {
        return this.set.isEmpty();
    }

    public void displaySet() {
        System.out.println("Set : " + this.set);
    }

    public void setIntersecton(MySet s2){
        for(int i = 0, j = 0; i<this.set.size() && j<s2.set.size(); ){
            if(this.set.get(i) < s2.set.get(j))
                i++;
            else if(this.set.get(i) > s2.set.get(j))
                j++;
            else{
                System.out.print(this.set.get(i) + "\t");
                i++; j++;
            }
        }
    }

    public void setDifference(MySet s2){
        int i, j;
        for(i = 0, j = 0; i<this.set.size() && j<s2.set.size();){
            if(this.set.get(i) < s2.set.get(j)){
                System.out.print(this.set.get(i) + "\t");
                i++;
            }
            else if(this.set.get(i) > s2.set.get(j))
                j++;
            else{
                i++; j++;
            }
        }

        while(i++ < this.set.size()){
            System.out.print(this.set.get(i) + "\t");
        }
    }

    public void setUnion(MySet s2) {
        int i = 0, j = 0;
        while (i < this.set.size() && j < s2.set.size()) {
            if (this.set.get(i) < s2.set.get(j)) {
                System.out.print(this.set.get(i) + "\t");
                i++;
            } else if (s2.set.get(j) < this.set.get(i)) {
                System.out.print(s2.set.get(j) + "\t");
                j++;
            } else {
                System.out.print(s2.set.get(j) + "\t");
                i++;
                j++;
            }
        }

        while (i < this.set.size()) {
            System.out.print(this.set.get(i) + "\t");
            i++;
        }
        while (j < s2.set.size()) {
            System.out.print(s2.set.get(j) + "\t");
            j++;
        }
    }
}

class MyMenu {
    public void fillSetValues(MySet set) {
        Scanner sc = new Scanner(System.in);
        label : 
        while (true) {
            set.displaySet();
            System.out.print("1. Insert\n2. Delete\n3.Quit creating set\nChoose : ");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter element to insert : ");
                    set.insert(sc.nextInt());
                    break;

                case 2:
                    if (set.is_Empty())
                        System.out.println("Empty Set ! ");
                    else {
                        System.out.println("Enter element to delete : ");
                        set.delete(sc.nextInt());
                    }
                    break;
                case 3:
                    break label;

                default:
                    System.out.println("INVALID CHOICE ! ");
            }
        }
    }
}

class SetTest {
    public static void main(String[] args) {
        MySet s1 = new MySet();
        MySet s2 = new MySet();

        MyMenu menu = new MyMenu();

        menu.fillSetValues(s1);
        menu.fillSetValues(s2);

        System.out.print("\nUNION : ");
        s1.setUnion(s2);
        System.out.print("\nINTERSECTION : ");
        s1.setIntersecton(s2);
        System.out.print("\nSET DIFFERENCE : ");
        s1.setDifference(s2);
    }

}
