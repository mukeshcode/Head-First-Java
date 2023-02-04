import java.util.Scanner;

public class EmpTest17{
	public static void main(String[] args){
		Manager m1 = new Manager();
		JrEngineer je1 = new JrEngineer();
		SrEngineer se1 = new SrEngineer();
		Director d1 = new Director();	

		m1.setData();
		m1.calcSalary();
		
		je1.setData();
		je1.calcSalary();
		
		se1.setData();
		se1.calcSalary();
		
		d1.setData();
		d1.calcSalary();

		m1.dispData();
		je1.dispData();
		se1.dispData();
		d1.dispData();
	}
}

abstract class Employee{
	private String emp_name;
	private String emp_post;
	private String emp_id;
	private double emp_salary;
	private double emp_exp;
	private double emp_bas_sal;
	private double hra = 0.2, da = 0.15;  
	Scanner sc = new Scanner(System.in);

	public void setData(){
		System.out.print("Enter Employee name       : ");
		this.emp_name = sc.nextLine();
		System.out.print("Enter Employee ID         : ");
		this.emp_id = sc.next();
		System.out.print("Enter Employee experience : ");
		this.emp_exp = sc.nextFloat();
	}
	public void setPost(String s){this.emp_post = s;}
	public void setBasicSal(double basic_sal){this.emp_bas_sal = basic_sal;}
	public double getBasicSal(){return this.emp_bas_sal;}
	public double get_hra(){return this.hra;}
	public double get_da(){return this.da;}
	public double get_exp(){return this.emp_exp;}
	public void setSalary(double salary){this.emp_salary = salary;}
	public void dispData(){
		System.out.println("---- " + this.emp_post + " ----");
		System.out.println("NAME            : " + this.emp_name.toUpperCase());
		System.out.println("WORK EXPERIENCE : " + this.emp_exp);
	}
	
	public void calcSalary(){
		double salary = this.emp_bas_sal + (this.emp_bas_sal*this.da) + (this.emp_bas_sal * this.hra);

		double bonus = 5000;
		if(this.get_exp() > 5.0)
			bonus = 20000.0;
		else if(this.get_exp() > 2.0)
			bonus = 10000;

		salary += bonus;

		this.setSalary(salary);
	}
}

class JrEngineer extends Employee{
	public void setData(){
		this.setPost("Junior Engineer");
		super.setData();
	}
	public void calcSalary(){
		double bas_sal = 30000;
		this.setBasicSal(bas_sal);
		super.calcSalary();
	}
}

class SrEngineer extends Employee{
	public void setData(){
		this.setPost("Senior Engineer");
		super.setData();
	}
	public void calcSalary(){
		double bas_sal = 40000;
		this.setBasicSal(bas_sal);
		super.calcSalary();
	}
}

class Manager extends Employee{
	public void setData(){
		this.setPost("Manager");
		super.setData();
	}
	public void calcSalary(){
		double bas_sal = 50000;
		this.setBasicSal(bas_sal);
		super.calcSalary();
	}
}

class Director extends Employee{
	public void setData(){
		this.setPost("Director");
		super.setData();
	}
	public void calcSalary(){
		double bas_sal = 70000;
		this.setBasicSal(bas_sal);
		super.calcSalary();
	}
}