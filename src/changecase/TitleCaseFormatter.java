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
public class TitleCaseFormatter implements CaseFormatter{
    @Override
    public String changeCase(String origString){
        String[] words = origString.split(" ");
        String result = "";
        for(String word : words){
            String ch = word.substring(0,1);
            String balance = word.substring(1);
            ch = ch.toUpperCase();
            result += ch + balance.toLowerCase();
            
        }
        return result;
    }
}
