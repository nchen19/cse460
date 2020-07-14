

import java.util.Deque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Sport_Medical_Practitioner {
	String over_rate = "";
    public void current_symptoms_summary(Athletes athlete) throws IndexOutOfBoundsException{
        try{
        	Deque<ArrayList> deque = athlete.deque;
        	
        	ArrayList<Integer> symptom_factors_array = deque.peek();
        	
        	int severity_score = 0;
			int total_number_symptoms = 0;
			int total_symptom_difference = 0;
			int total_severity_score_difference = 0;
			for(int i = 0; i < symptom_factors_array.size(); ++i){
				if(symptom_factors_array.get(i) != 0){
					++total_number_symptoms;
				}
			}
			System.out.println("Total number of symptoms: " + total_number_symptoms);
			for(int i = 0; i < symptom_factors_array.size(); ++i){
				severity_score = severity_score + symptom_factors_array.get(i);
			}
			System.out.println("Symptom severity score: " + severity_score);
			
			if(deque.size() == 0 || deque.size() == 1){
				System.out.println("No overall rating because of no previous game");
			}
			else{
				deque.removeFirst();
				int compare_severity_score = 0;
				ArrayList<Integer> compare_symptom_factors_array = deque.peek();
				for(int i = 0; i < symptom_factors_array.size(); ++i){
					if(compare_symptom_factors_array.get(i) != symptom_factors_array.get(i)){
						++total_symptom_difference;
					}
				}
				for(int i = 0; i < compare_symptom_factors_array.size(); ++i){
					compare_severity_score = compare_severity_score + compare_symptom_factors_array.get(i);
				}
				total_severity_score_difference = Math.abs(severity_score-compare_severity_score);
				if(total_symptom_difference < 3 && total_severity_score_difference < 10){
					over_rate = "No difference";
				}
				if(total_symptom_difference < 3 && total_severity_score_difference >= 10){
					over_rate = "Unsure";
				}
				if(total_symptom_difference >= 3 || total_severity_score_difference >= 15){
					over_rate = "Very different";
				}
				System.out.println("Overall rating: " + over_rate);
				deque.addFirst(symptom_factors_array);
			}

        }catch (Exception e){
            System.out.println("\nYou don't have any game in record!\n");
        }

    }

    public void if_at_risk(Athletes athlete) throws IndexOutOfBoundsException{
        try{
			if(over_rate == "No difference"){
				System.out.println(over_rate + ": "+ "GREEN");
			}
			else if(over_rate == "Unsure"){
				System.out.println(over_rate + ": "+ "YELLOW");
			}
			else if(over_rate == "Very different"){
				System.out.println(over_rate + ": "+ "RED");
			}
        }catch (Exception e){
            System.out.println("\nYou don't have any game in record\n");
        }
    }


}