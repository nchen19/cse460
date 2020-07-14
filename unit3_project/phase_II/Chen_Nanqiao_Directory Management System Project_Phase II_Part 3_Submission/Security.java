package cse460_unit3_project_part2;

import cse460_unit3_project_part2.Person;

public class Security extends Person{
	private int SecurityID;
	private double baseSalary;
	public Security(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		SecurityID = id;
		baseSalary = sal;
	}
	public int getID()
	{
		return SecurityID;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
}