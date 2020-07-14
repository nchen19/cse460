

import java.util.Scanner;

public class app_UI {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);
        
        int choice = 0;

        Athletes athlete = new Athletes();
        Sport_Medical_Practitioner smp = new Sport_Medical_Practitioner();

        do{
			System.out.println("Please select one of the following options");
			System.out.println("1. Enter Symptoms");
			System.out.println("2. Display Symptoms Summary");
			System.out.println("3. Am I at Risk?");
			System.out.println("4. Exit");
			System.out.println("Enter your choice (1-4):");
            choice = scan.nextInt();
            
            if(choice == 1){
            	athlete.collect_sympotoms();
            }
            else if(choice == 2){
            	smp.current_symptoms_summary(athlete);
            }
            else if(choice == 3){
            	smp.if_at_risk(athlete);
            }
            else if(choice == 4){
            	
            }
        	else{
        		System.out.println("Please enter your choice that is digit from number 1 to 4!");
        	}
        	
        }while(choice != 4);
        System.out.println("You already Exited");
    }

}
