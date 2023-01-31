import java.util.Scanner;

public class StudentRecTest2{
	public static void main(String[] args){
		Student s1 = new Student();

		s1.setInfo();
		s1.generateReport();
	}
}

class Student{
	private String name, reg_no;
	private Marks marks;
	private Report report;

	public void setInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name     : ");
		this.name = sc.nextLine();
		System.out.print("Enter reg. no. : ");
		this.reg_no = sc.next();

		this.marks = new Marks();
		this.marks.setMarks();
	}

	public void generateReport(){
		report = new Report(this.marks);
		System.out.println("---- S T U D E N T   R E P O R T ----");
		System.out.println("NAME       : " + this.name.toUpperCase());
		System.out.println("REG. NO.   : " + this.reg_no.toUpperCase());
		System.out.println("RESULT     : " + (this.report.getIsPassExam() ? "PASS" : "FAIL"));
		System.out.println("TOTAL MARKS: " + ((this.report.getIsPassExam()) ? this.report.getTotalMarks() : "?"));
		System.out.println("--Semester Marklist--");
		System.out.println("S. No.\tSubject\t\tMarks\t\tResult");
		
		double[] marks = this.marks.getMarks();
		String[] sub = this.marks.getSub();
		boolean[] isPassSub = this.report.getIsPassSub();
		int sub_len = sub.length;

		for(int i = 0; i<sub_len; i++){
			System.out.print((i+1) + "\t");
			System.out.print(sub[i].toUpperCase() + "\t\t");
			System.out.print(marks[i] + "/50\t\t");
			System.out.println((isPassSub[i]?"Pass":"Fail") + "\t");
		}
	}
}

class Marks{
	private double[] marks;
	private String[] sub = {"lang_c", "lang_cp", "lang_j", "lang_py"};

	public void setMarks(){
		this.marks = new double[4];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks in lang_C    : ");
		this.marks[0] = sc.nextDouble();
		System.out.print("Enter marks in lang_cpp  : ");
		this.marks[1] = sc.nextDouble();
		System.out.print("Enter marks in lang_java : ");
		this.marks[2] = sc.nextDouble();
		System.out.print("Enter marks in lang_py   : ");
		this.marks[3] = sc.nextDouble();
	}

	public double[] getMarks(){return this.marks;}
	public String[] getSub(){return this.sub;}
}

class Report{
	private boolean[] isPassSub;
	private boolean isPassExam;
	private double totalMarks;

	Report(Marks marks){
		this.isPassSub = new boolean[4];
		this.isPassExam = true;
		this.totalMarks = 0.0;
		double[] subMarks = marks.getMarks();
		for(int i = 0; i<subMarks.length; i++){
			this.totalMarks += subMarks[i];
			if(subMarks[i] >= 25){
				this.isPassSub[i] = true;
			}
		}

		for(boolean b : isPassSub){
			if(b == false){
				this.isPassExam = false;
				break;
			}
		}
	}

	public boolean[] getIsPassSub(){return this.isPassSub;}
	public boolean getIsPassExam(){return this.isPassExam;}
	public double getTotalMarks(){return this.totalMarks;}
	
}