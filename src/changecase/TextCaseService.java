/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changecase;

/**
 *
 * @author johnny
 */
public class TextCaseService {
    private CaseFormatter formatter;
    
    
    public String changeCase(String origString){
        return formatter.changeCase(origString);
        
    }

    public CaseFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(CaseFormatter formatter) {
        this.formatter = formatter;
    }
    
}
