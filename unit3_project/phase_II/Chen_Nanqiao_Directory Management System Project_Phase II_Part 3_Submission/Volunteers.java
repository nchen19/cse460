package cse460_unit3_project_part2;

import cse460_unit3_project_part2.Person;

public class Volunteers extends Person{
	private int VolunteersID;
	private double baseSalary;
	public Volunteers(String last, String first, String middle, int id, double sal) {
		super(last, first, middle);
		VolunteersID = id;
		baseSalary = sal;
	}
	public int getID()
	{
		return VolunteersID;
	}
	public double getBaseSalary(){
		return baseSalary;
	}
}

