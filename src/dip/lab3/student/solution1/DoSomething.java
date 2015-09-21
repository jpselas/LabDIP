/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author johnny
 */
public class DoSomething {
    public static void main(String[] args) {
		
		Reader read = new KeyboardReader();
		Writer write = new GuiWriter();
		Reader read2 = new GuiReader();
		Writer write2 = new FileWriter();
		CopyService copier = new CopyService(read,write);
		copier.copy();
		CopyService copier2 = new CopyService(read2,write2);
		copier2.copy();
		// Send end of program message
		System.out.println("Program ended. Line of reader input copied successfully to writer output.");
	}
}
