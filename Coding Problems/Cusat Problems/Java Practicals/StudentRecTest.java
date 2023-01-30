// A program to store student information and to generate report on the basis of the stored information.

import java.util.Scanner;

public class StudentRecTest{
	public static void main(String[] args){
		Student stud1 = new Student();
		stud1.feedInfo();
		stud1.generateReport();		
	}
}

class Student{
	private String name;
	private String regNo;
	private int totalSub;
	private Marks marks;
	private Report report;
	private String[] sub = {"Lang_java", "Lang_C", "Lang_CPP", "Lang_Py"};
	
	public void feedInfo(){
		Scanner sc = new Scanner(System.in);
		this.totalSub = 4;
		System.out.print("Enter name     : ");
		this.name = sc.nextLine();
		System.out.print("Enter Reg. no. : ");
		this.regNo = sc.next();
		
		this.marks = new Marks();
		this.marks.feedMarks();
	}
	
	public void generateReport(){
		report = new Report(this.marks);
		System.out.println("---- S T U D E N T   R E P O R T ----");
		System.out.println("Your Name         : " + this.name);	
		System.out.println("Your Reg no.      : " + this.regNo);
		System.out.println("Exam Pass (T/F)   : " + report.getIsPass_exam());
// 		System.out.println("S.NO.\tSub\tPass\tMarks");
		for(int i = 0; i<this.totalSub; i++){
		    String replace = (this.marks.getMarks())[i]>=25.0 ? "pass" : "fail";
		    System.out.println("You are " + replace + " in " + this.sub[i] + " with " + (this.marks.getMarks())[i] + " marks");
		}
	}

}

class Marks{
	private double lang_java, lang_c, lang_cpp, lang_py;
	
	public void feedMarks(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lang_java marks : ");
		this.lang_java = sc.nextDouble();
		System.out.print("Enter lang_c    marks : ");
		this.lang_c = sc.nextDouble();
		System.out.print("Enter lang_c++  marks : ");
		this.lang_cpp = sc.nextDouble();
		System.out.print("Enter lang_py   marks : ");
		this.lang_py = sc.nextDouble();
	}
	
	public double[] getMarks(){
		double[] allMarks = {this.lang_java, this.lang_c, this.lang_cpp, this.lang_py};
		return allMarks;
	}
}

class Report{
	private boolean[] isPass_sub;
	private boolean isPass_exam;
	private double totalMarks;
	
	Report(Marks marks){
		this.isPass_sub = new boolean[4];
		this.totalMarks = 0;
		for(int i = 0; i<marks.getMarks().length; i++){
			this.totalMarks += (marks.getMarks())[i];
			if((marks.getMarks())[i] >= 25)
				this.isPass_sub[i] = true;
		}		
		
		if(this.totalMarks / 2 >= 25.0)
			isPass_exam = true;		
	}

	public double getTotalMarks(){return this.totalMarks;}
	public boolean getIsPass_exam(){return this.isPass_exam;}
	public boolean[] getIsPass_sub(){return this.isPass_sub;}
		
}
