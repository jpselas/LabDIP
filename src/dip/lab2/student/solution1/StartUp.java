/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class StartUp {
    
 
    public static void main(String[] args) {
        
        TipCalculator cal1 = new FoodServiceTipCalculator(ServiceQuality.GOOD,50);
        TipCalculator cal2 = new BaggageServiceTipCalculator(ServiceQuality.POOR,4);
        
        TipService you = new TipService(cal1);
        TipService youGuy = new TipService(cal2);
        System.out.println(you.getTip(cal1));
        System.out.println(youGuy.getTip(cal2));
//        System.out.println(cal1.getTip());
//        System.out.println(cal2.getTip());
        
    }

}
