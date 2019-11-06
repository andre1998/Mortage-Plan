/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

/**
 *
 * @author André
 */
public class customer {
    
    private final String customerName;
    private final double loanAmount;
    private final double interest;
    private final int years;
    
    private final double monthlyPayment;
   
    public customer(String customerName, double loanAmount, double interest, int years) {
        this.customerName = customerName;
        this.loanAmount = loanAmount;
        this.interest = interest;
        this.years = years;
        
        this.monthlyPayment = (interest*(loanAmount/100)*years+loanAmount)/(years*12);//(years*12);
    }
    
    public String getName() {
        return customerName;
    }
    
    public double getLoan() {
        return loanAmount;
    }   
    
    public double getInterest() {
        return interest;
    }
    
    public int getYears() {
        return years;
    }
    
    public double getMonthlyPayment(){
        return monthlyPayment;
    }
}
