package cse460_unit3_project_part2;

import cse460_unit3_project_part2.Person;

public class Executives extends Person{
	private int ExecutivesID;
	private double baseSalary;
	public Executives(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		ExecutivesID = id;
		baseSalary = sal;
	}
	public int getID()
	{
		return ExecutivesID;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
}