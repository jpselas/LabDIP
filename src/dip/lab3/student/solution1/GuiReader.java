/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author johnny
 */
public class GuiReader implements Reader{
    
    @Override 
    public String getReadOut() {
            return JOptionPane.MESSAGE_PROPERTY;
	}
    
    
}
