/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author johnny
 */
public class TipService {
    private TipCalculator t;
public double getTip(TipCalculator t){
    return t.getTip();
    
}

    public TipService(TipCalculator t) {
        this.t = t;
    }

    public TipCalculator getT() {
        return t;
    }

    public void setT(TipCalculator t) {
        this.t = t;
    }
    
}
