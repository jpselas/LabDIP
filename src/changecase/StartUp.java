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
public class StartUp {
    
    public static void main(String[] args) {
        
        CaseFormatter f = new UpperCaseFormatter();
        TextCaseService srv = new TextCaseService();
        srv.setFormatter(f);
        String s = srv.changeCase("hello world");
        System.out.println(s);
        
        
        
    }
    
}
