import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class Student{
    private String name, reg_n;
    private boolean elective;
    private Marks marks;

    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Reg. no. : ");
        this.reg_n = sc.next();
        String res;
        this.elective = false;
        do{
            System.out.print("Elect an additonal sub(yes/no) : ");
            res = sc.next();
        }while(!((res.equalsIgnoreCase("yes")?(this.elective = true):(this.elective = false)) || res.equalsIgnoreCase("no")));
        marks = new Marks(this.elective);
    }

    public void setMarks(){
        marks.setMarks();
    }

    public void getGrades(){
        double average;
        if(this.elective)
            average = marks.getGrades(true);
        else 
            average = marks.getGrades();

        System.out.print("CGPA : " + String.format("%.2f", average));
    }
}

class Marks{
    private ArrayList<Integer> marksList;
    private int n_sub;
    private ArrayList<String> subList;
    Marks(boolean elective){
        this.n_sub = elective ? 6 : 5;
        this.subList = new ArrayList<String>(Arrays.asList("Lang_A", "Lang_B", "Lang_C","Lang_D", "Lang_E"));
        this.marksList = new ArrayList<Integer>();
        
        if(elective)
            this.subList.add("Lang_F");
    }

    public void setMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        for(int i = 0; i<this.n_sub; i++){
            System.out.print(this.subList.get(i) + " : ");
            this.marksList.add(sc.nextInt());
        }
    }

    public double getGrades(boolean elective){
        this.marksList.sort(Comparator.reverseOrder());
        double average = 0.;
        for(int i = 0; i<n_sub - 1; i++)
            average += this.marksList.get(i);
        average /= 5;
        System.out.println("Your Marks : " + this.marksList.subList(0, 5));
        return average;
    }

    public double getGrades(){
        double average = 0.;
        for(double marks : marksList)
            average += marks;

        average /= this.n_sub;
        System.out.println("Your Marks : " + this.marksList);
        return average;
    }
}

class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setMarks();
        s1.getGrades();
    }
}
