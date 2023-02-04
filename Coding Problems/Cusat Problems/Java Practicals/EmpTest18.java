import java.util.Scanner;

public class EmpTest18{
	public static void main(String[] args){
		Manager m1 = new Manager();
		Engineer e1 = new Engineer();

		m1.readData();
		e1.readData();
		m1.calcSalary();
		e1.calcSalary();
	}
}

interface HandlerMethods{
	public abstract void readData();
	public abstract void calcSalary();
}

abstract class Employee implements HandlerMethods{
	private String emp_name, emp_id, emp_desg;
	private double emp_exp, emp_salary;

	public void setName(String name){this.emp_name = name;}
	public String getName(){return this.emp_name;}
	public void setId(String id){this.emp_id = id;}
	public void setSalary(double salary){this.emp_salary = salary;}
	public double getSalary(){return this.emp_salary;}
	public void setDesg(String desg){this.emp_desg = desg;}
	public String getDesg(){return this.emp_desg;}
	public void setExp(double exp){this.emp_exp = exp;}
	public double getExp(){return this.emp_exp;}
}

class Manager extends Employee{
	public void readData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name, Sir : ");
		this.setName(sc.nextLine());
		System.out.print("Enter your id,   Sir : ");
		this.setId(sc.next());
		System.out.print("Enter your exp,  Sir : ");
		this.setExp(sc.nextDouble());
		this.setDesg("Manager");
	}
	public void calcSalary(){
		double salary = 30000 + (30000 * (this.getExp()/2));
		this.setSalary(salary);

		System.out.println("(((( " + this.getDesg() + " ))))");
		System.out.println("NAME   : " + this.getName().toUpperCase());
		System.out.println("EXP.   : " + this.getExp());
		System.out.println("SALARY : " + this.getSalary());
	}
}

class Engineer extends Employee{
	public void readData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		this.setName(sc.nextLine());
		System.out.print("Enter your id   : ");
		this.setId(sc.next());
		System.out.print("Enter your exp  : ");
		this.setExp(sc.nextDouble());
		this.setDesg("Engineer");
	}
	public void calcSalary(){
		double salary = 20000 + (20000 * (this.getExp()/2));
		this.setSalary(salary);

		System.out.println("**** " + this.getDesg() +" ****");
		System.out.println("NAME   : " + this.getName().toUpperCase());
		System.out.println("EXP.   : " + this.getExp());
		System.out.println("SALARY : " + this.getSalary());
	}
}