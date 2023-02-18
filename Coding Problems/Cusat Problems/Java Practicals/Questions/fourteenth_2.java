import java.util.*;

class Student{
    private String name, reg_n;
    private ArrayList<Integer> marksList;
    private ArrayList<String> subList;
    private boolean elective;
    private int n_sub;

    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Reg_no : ");
        this.reg_n = sc.next();
        System.out.print("Opt an elective(yes/no) : ");
        String ch = sc.next();
        this.elective = ch.equalsIgnoreCase("yes") ? true : false;
        n_sub = this.elective ? 6 : 5;

        this.subList = new ArrayList<String>(Arrays.asList("Lang_A", "Lang_B", "Lang_C", "Lang_D", "Lang_E"));
        if(this.elective)
            this.subList.add("Lang_F");
        this.marksList = new ArrayList<Integer>();
    }

    public void setMarks(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        for(int i = 0; i<this.n_sub; i++){
            int marks;
            do{
                System.out.print(this.subList.get(i) + " : ");
                marks = sc.nextInt();
            }while(marks<0 || marks>100);
            this.marksList.add(marks);
        }
    }
    
    public void printGrades(){
        double average;
        if(this.elective)
            average = this.getGrades(true);
        else
            average = this.getGrades();

        System.out.println("Your Marks : " + this.marksList);
        System.out.println("Average : " + average);
    }

    public double getGrades(){
        double average = 0;
        for(int marks : this.marksList)
            average += marks;
        average /= 5;
        return average;
    }
    public double getGrades(boolean elective){
        marksList.sort(Comparator.reverseOrder());
        double average = 0;
        for(int marks : this.marksList.subList(0, this.n_sub-1))
            average += marks;

        average /= 5;
        return average;

    }
}

class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setMarks();
        s1.printGrades();
    }
}
