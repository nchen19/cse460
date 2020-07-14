package cse460_unit3_project_part2;

import cse460_unit3_project_part2.Person;

public class Employee extends Person{
	private int empID;
	private double baseSalary;
	public Employee(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		empID = id;
		baseSalary = sal;
	}
	public int getID()
	{
		return empID;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
}
