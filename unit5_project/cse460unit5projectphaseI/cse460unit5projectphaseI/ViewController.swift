//
//  ViewController.swift
//  cse460unit5projectphaseI
//
//  Created by nanqiao chen on 6/22/20.
//  Copyright © 2020 nanqiao chen. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
    }
    
    @IBAction func didTapButton(){
        let vc = storyboard?.instantiateViewController(identifier: "subfirstViewController") as! subfirstViewController
        vc.modalPresentationStyle = .fullScreen
        present(vc, animated: true)
        
    }
  
    @IBAction func didTapButton1(){
        let vc1 = storyboard?.instantiateViewController(identifier: "subsecondViewController") as! subsecondViewController
        vc1.modalPresentationStyle = .fullScreen
        present(vc1, animated: true)
    }
}

