package com.jhf.labten;

public class Employee {
	static int MAXIMUM_SALARY=40000; //the highest salary value
	private  String emp_name; //this is permanent
	private int age;
	private double emp_salary;
	public static int getMAXIMUM_SALARY() {
		return MAXIMUM_SALARY;
	}
	public static void setMAXIMUM_SALARY(int mAXIMUM_SALARY) {
		MAXIMUM_SALARY = mAXIMUM_SALARY;
	}

	
	public Employee() {
		this.emp_name = null;
		this.age = age=0;
		this.emp_salary  =0.0;
	}
	
	public Employee(String emp_name, int age, double emp_salary) {
		super();
		this.emp_name = emp_name;
		this.age = age;
		this.emp_salary = emp_salary;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	
	

