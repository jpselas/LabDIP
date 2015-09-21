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
public class CopyService {
    private Reader read;
    private Writer write;
    
    public CopyService( Reader read, Writer write ) {
		this.read = read;
		this.write = write;
	}
    
    public void copy() {
            String line = read.getReadOut();
            write.getWriteOut( line );
	}
    
}
