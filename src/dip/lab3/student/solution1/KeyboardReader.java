/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;
/**
 *
 * @author johnny
 */
public class KeyboardReader implements Reader{
    @Override
    public String getReadOut() {
            System.out.println("Please enter something funny, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
    
    
    
}
