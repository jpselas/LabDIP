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
public class FoodServiceTipCalculator implements TipCalculator{
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private  String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + minBill;
    private  double goodRate = 0.20;
    private  double fairRate = 0.15;
    private  double poorRate = 0.10;

    private double bill;

    
    
    private ServiceQuality serviceQuality;

    /**
     *
     * @param q checks for enum value 
     * @param billAmt is the amount the bill is 
     */
    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    /**
     *
     * @return the tip value depending on which enum was selected and multiplying by the bill
     */
    @Override
    public final double getTip() {
        double tip = 0.00; 

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    /**
     *
     * @param billAmt is taken in and the bill is set with the value of billAmt
     */
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    /**
     *
     * @param q is the enum value taken in and set to the variable serviceQuality
     */
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    /**
     *
     * @return the value in serviceQuality
     */
    public final ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
