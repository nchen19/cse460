package cse460_unit3_project_part2;

import java.util.Scanner;

import cse460_unit3_project_part2.Employee;
import cse460_unit3_project_part2.Person;
import cse460_unit3_project_part2.Personnel;
import cse460_unit3_project_part2.totalObjects;
public class PersonnelDirectory
{
   public static void main(String[] args)
   {
              Personnel per = new Personnel();
			  totalObjects total = new totalObjects();
			  Scanner scan = new Scanner(System.in);
			  String firstN, lastN, middleN;
			  int empID;
			  double salary;
              int choice = -1;
      do{
          System.out.println("Welcome to the Personnel Directory Management System");
          System.out.println("====================================================");
          System.out.println("\n\n\t 1. Add Personel");
          System.out.println("\n\t 2. Find Personel");
          System.out.println("\n\t 3. Print Names");
          System.out.println("\n\t 4. Number of Entries in the Directory");
          System.out.println("\n\t 5. Exit");
          System.out.println("\n\t Select one of the options above (1, 2, 3, 4, 5)");
          choice = scan.nextInt();
          scan.nextLine();

          switch(choice)
          {
			  case 1:
			  System.out.println("Enter first name: ");
			  firstN = scan.nextLine();
			  System.out.println("Enter last name: ");
			  lastN = scan.nextLine();
			  System.out.println("Enter middle name: ");
			  middleN = scan.nextLine();
			  System.out.println("Enter empploy id : ");
			  empID = scan.nextInt();
			  System.out.println("Enter base salaey" );
			  salary = scan.nextDouble();
			  scan.nextLine();
			  System.out.println("please enter your person's types 1: Employee, 2: Executive, 3: Security, 4: Volunteer" );
			  int type = scan.nextInt();
			  
			  Person act = PersonTypeFactory.getPersonType(type, lastN, firstN, middleN, empID, salary);
			  per.addPersonnel(act);
			  total.objectAdded();

			  break;

			  case 2:

			  System.out.println("Enter firts name : ");
			  firstN = scan.nextLine();

			  System.out.println("Enter last name : ");
			  lastN = scan.nextLine();

			  
              boolean found = false;
			  int loc =-1;
			  for(int i =0; i <per.personList.size(); i++)
			  {
				  if( per.personList.get(i).getFirstName().equals(firstN) && per.personList.get(i).getLastName().equals(lastN))
			  	  {
					  found = true;
			  		  loc = i;
					  if(found)
					  {
						  System.out.println("Found");
						  per.personList.get(loc).printName(0);
					  }else
					  {
					  	  System.out.println("not found");
					  }
			  	  }
			  }

              break;

			  case 3:

			  System.out.println("Enter the order 0: first, middle,  last, 1: first, last, middle, 2: last, first , middle ");
			  int order = scan.nextInt();
			  for(int i=0; i<per.personList.size(); i++)
			  {
				  per.personList.get(i).printName(order);
			  }

              break;

			  case 4:
			  System.out.println("Total Entries : " + total.getTotalObjects());
			  break;

		  }
		 } while(choice != 5);
      System.out.println("Already exit");
  }
}