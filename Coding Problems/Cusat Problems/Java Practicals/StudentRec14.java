import java.util.Scanner;

public class StudentRec14{
	public static void main(String[] args){
		Student stud = new Student();

		stud.setMarks();
		stud.printResult();
	}
}

class Student{
	private Marks marks;
	private boolean optAdditional;
	Scanner sc = new Scanner(System.in);	

	Student(){
		System.out.print("Choose an additional subject(true/false) : "); 
		this.optAdditional = sc.nextBoolean();
	}

	public void setMarks(){
		marks = new Marks();
		System.out.println("Enter marks");
		System.out.print("lang_c : ");
		this.marks.lang_c = sc.nextInt();
		System.out.print("lang_java : ");
		this.marks.lang_java = sc.nextInt();
		System.out.print("lang_cpp : ");
		this.marks.lang_cpp = sc.nextInt();
		System.out.print("lang_py : ");
		this.marks.lang_py = sc.nextInt();
		System.out.print("lang_html : ");
		this.marks.lang_html = sc.nextInt();
		
		if(this.optAdditional){
			System.out.print("lang_kot : ");
			this.marks.lang_kot = sc.nextInt();
		}
	}

	public void printResult(){
		if(this.optAdditional)
			printAverage(true);
		else 
			printAverage();
	}

	public void printAverage(){
		System.out.println("Average : " + (this.marks.lang_c + this.marks.lang_cpp + this.marks.lang_java + this.marks.lang_py + this.marks.lang_html) / 5);
	}
	
	public void printAverage(boolean signal){
		double [] marks_arr = {this.marks.lang_c , this.marks.lang_cpp, this.marks.lang_java, this.marks.lang_py, this.marks.lang_html, this.marks.lang_kot};
		
		for(int i = 1, j; i<6; i++){
			double value = marks_arr[i];
			for(j = i-1; j>=0 && marks_arr[j] < value; j--){
				marks_arr[j+1] = marks_arr[j];
			}
			marks_arr[j+1] = value;
		}

		int sum = 0;
		for(int i = 0; i<5; i++)
			sum += marks_arr[i];

		System.out.println("Average : " + sum/5.0);
	}
}

class Marks{
	public double lang_c, lang_cpp, lang_java, lang_py, lang_html, lang_kot;
}