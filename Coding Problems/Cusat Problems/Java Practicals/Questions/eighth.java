import java.util.Scanner;

class Student{
    private String name, reg_no;
    private Marks marks;

    Student(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        this.name = sc.nextLine();
        System.out.print("Enter Reg. No. : ");
        this.reg_no = sc.next();

        marks = new Marks();
    }

    public void printResult(){
        String[] sub = this.marks.getSub();
        int[] marks = this.marks.getMarks();
        boolean[] pass = this.marks.getPass();
        System.out.println("(((( R E S U L T  ))))");
        System.out.println("Name : " + this.name.toUpperCase());
        System.out.println("Register No. : " + this.reg_no);

        System.out.println("Subject\tMarks\tResult");
        for(int i = 0; i<marks.length; i++){
            System.out.println(sub[i] + "\t" + marks[i] + "\t" + (pass[i]?"Pass":"Fail"));
        }

        boolean passedExam = true;
        for(boolean x : pass){
            if(x == false){
                passedExam = false;
                break;
            }
        }

        System.out.println("Result : " + (passedExam ? "Pass" : "Fail"));

        if(passedExam){
            int total = 0;
            for(int x : marks)
                total += x;
            System.out.print("Total Marks : " + total);
        }
    }
}

class Marks{
    String [] sub;
    int[] marks;
    int n_sub = 4;

    Marks(){
        this.sub = new String[this.n_sub];
        this.sub[0] = "Lang_A";
        this.sub[1] = "Lang_B";
        this.sub[2] = "Lang_C";
        this.sub[3] = "Lang_D";

        this.marks = new int[this.n_sub];

        Scanner sc = new Scanner(System.in);
        System.out.println("---- Enter marks ----");
        for(int i = 0; i<n_sub; i++){
            do{
                System.out.print(this.sub[i] + " : ");
                this.marks[i] = sc.nextInt();
            }while(this.marks[i] < 0 || this.marks[i] > 50);
        }
    }

    public boolean validateMarks(int marks){return marks>=0 && marks<=50;}
    public String[] getSub(){return this.sub;}
    public int[] getMarks(){return this.marks;}
    public boolean[] getPass(){
        boolean[] pass = new boolean[this.n_sub];
        for(int i = 0; i<this.n_sub; i++){
            pass[i] = this.marks[i] >= 25;
        }
        return pass;
    }
}

class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.printResult();
    }
}
