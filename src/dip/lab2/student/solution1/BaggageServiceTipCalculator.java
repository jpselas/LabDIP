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
public class BaggageServiceTipCalculator implements TipCalculator{
    private  double minBill = 0.00;
    private  double maxBill = 100.00;
    private final String BILL_ENTRY_ERR =
            "Error: bill must be between " + minBill + " and "
            + maxBill;
    private   double goodRate = 0.20;
    private   double fairRate = 0.15;
    private   double poorRate = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    
    private ServiceQuality serviceQuality;

    /**
     *
     * @param q checks for enum value 
     * @param bags takes in how many bags they carried 
     */
    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        this.setServiceRating(q); 
        this.setBagCount(bags);

        baseTipPerBag = 1.00; 
    }

    /**
     *
     * @return returns the tip value after figuring out how many bags carried 
     */
    @Override
    public final double getTip() {
        double tip = 0.00; 

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }

        return tip;
    }

    /**
     *
     * @param q sets the serviceQuality variable to the value of q
     */
    public final void setServiceRating(ServiceQuality q) {
        
        serviceQuality = q;
    }

    /**
     *
     * @return
     */
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public final int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public final double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public final void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
}
