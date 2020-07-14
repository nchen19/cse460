

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Athletes {
	Deque<ArrayList> deque = new LinkedList<ArrayList>();
    //List<SymptomRecord.Symptom> five_games = new ArrayList<>();

    public void collect_sympotoms(){

        ////Symptom one_game = new Symptom();
        
        ArrayList<Integer> symptom_factors_array = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your headache score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		int temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your pressure in head score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your neck pain score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your nausea or vomitting score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your dizziness score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your blurred vision score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your balance problems score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your sensitivity to light score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your sensitivity to noise score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your feeling slow down score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your feeling like a 'in a fog' score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your don't feel right score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your difficulty concentrating score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your difficulty remembering score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your fatigue or low energy score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your confusion score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your drowsiness score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your trouble falling asleep score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your more emotional score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your irritability score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your sadness score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		System.out.println("Please enter your nervous or anxious score (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
		temp = scan.nextInt();
		while(temp <0 || temp > 6){
			System.out.println("Please re-enter digit number from 0 to 6 (none (0), mild(1-2), moderate(3-4), $ severe(5-6)): ");
			temp = scan.nextInt();	
		}
		symptom_factors_array.add(temp);
		
		if(deque.size() < 5){
			deque.addFirst(symptom_factors_array);
		}
		else{
			deque.removeLast();
			deque.addFirst(symptom_factors_array);
		}
    }
}
