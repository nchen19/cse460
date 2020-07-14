//
//  Calmodel.swift
//  cse460unit5projectphaseI
//
//  Created by nanqiao chen on 6/22/20.
//  Copyright © 2020 nanqiao chen. All rights reserved.
//

import Foundation

class Calculator{
    var height: Double
    var weight: Double
    
    init(height: Double, weight: Double) {
        self.height = height
        self.weight = weight
    }
    
    func BMI() -> Double {
        let BMI_value = (weight/(height*height))*703
        return BMI_value
    }
    
    func Label_value() -> String {
        let BMI_value = (weight/(height*height))*703
        let c:String = String(format: "%.2f", BMI_value)
        if(BMI_value < 18){
            return c
        }
        else if(BMI_value >= 18 && BMI_value < 25){
            return c
        }
        else if(BMI_value >= 25 && BMI_value < 30){
            return c
        }
        else{
            return c
        }
    }
    
    func Message_value() -> String {
        let BMI_value = (weight/(height*height))*703
        if(BMI_value < 18){
            return "You are underweight"
        }
        else if(BMI_value >= 18 && BMI_value < 25){
            return "You are normal"
        }
        else if(BMI_value >= 25 && BMI_value < 30){
            return "You are pre-obese"
        }
        else{
            return "You are obese"
        }
    }
    
    
    
    
}
