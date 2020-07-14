package cse460_unit3_project_part2;

public class PersonTypeFactory {
	public static Person getPersonType(int type, String last, String first, String middle, int id, double sal)
	{
	     switch(type)
	     {
	        case 1:
	        return new Employee(last, first, middle, id, sal);
	        //break;
	        case 2:
	        return new Executives(last, first, middle, id, sal);
	        //break;
	        case 3:
	        return new Security(last, first, middle, id, sal);
	        //break;
	        case 4:
	        return new Volunteers(last, first, middle, id, sal);
	        //break;
	        default:
	        return null;
	     }
	}
}
