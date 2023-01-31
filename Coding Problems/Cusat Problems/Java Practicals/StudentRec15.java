import java.util.Scanner;

public class StudentRec15{
	public static void main(String[] args){
		Student stud = new StudentOptingExtra();
		
		stud.setMarks();
		stud.printResult();
	}
}

class Student{
	public double lang_c, lang_cpp, lang_java,lang_py, lang_html;
	public double totalMarks;	
	public double totalSub;

	Student(){
		this.totalMarks = 0;
		this.totalSub = 5;
	}

	public void setMarks(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		System.out.print("lang_c    : ");
		this.lang_c = sc.nextDouble();
		System.out.print("lang_cpp  : ");
		this.lang_cpp = sc.nextDouble();
		System.out.print("lang_java : ");
		this.lang_java = sc.nextDouble();
		System.out.print("lang_py   : ");
		this.lang_py = sc.nextDouble();
		System.out.print("lang_html : ");
		this.lang_html = sc.nextDouble();
	}

	public void printResult(){
		this.totalMarks += this.lang_c + this.lang_cpp + this.lang_java + this.lang_py + this.lang_html;
		System.out.println("Total average : " + (this.totalMarks/this.totalSub));
	}
	
}

class StudentOptingExtra extends Student{
	public double lang_kot;

	StudentOptingExtra(){
		this.totalSub = 6;
	}
	
	public void setMarks(){
		Scanner sc = new Scanner(System.in);
		super.setMarks();
		System.out.print("lang_kot : ");
		this.lang_kot = sc.nextDouble();
	}

	public void printResult(){
		this.totalMarks += this.lang_kot;
		super.printResult();
	}
}