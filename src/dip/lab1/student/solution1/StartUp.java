/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;
import java.text.NumberFormat;
/**
 *
 * @author johnny
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        
        Employee emp1 = new SalariedEmployee(45000, 1250);
        Employee emp2 = new SalariedEmployee(90000,0);
        
        
        Employee[] employees = {emp1, emp2};

        
        HRService hr = new HRService();

        
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            nf.format(hr.getAnnualCompensationForEmployee(employees[i])));
        }
        
        
        
    }
    
    
    
    
}
