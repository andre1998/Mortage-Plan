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
public class Customer {
    
    private final String customerName;
    private final double loanAmount;
    private final double interest;
    private final int years;
    
    private double monthlyPayment;
   
    public Customer(String customerName, double loanAmount, double interest, int years) {
        customerName=customerName.replaceAll("[\",.]","");
        customerName=customerName.replaceAll("[0-9]","");
        
        this.customerName = customerName.trim().replaceAll(" +", " ");
        this.loanAmount = loanAmount;
        this.interest = interest;
        this.years = years;
        this.monthlyPayment = 0;
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
    
    public int getYear() {
        return years;
    }
    
    public double getMonthlyPayment(){ 
        return monthlyPayment;
    }
    
    public void setMonthlyPayment(){
        double result = 0;
        //Delar med 12 för att få ränta per månad
        double percentage = interest/100/12;
        
        double tempNumber = (1+percentage);

        double base = tempNumber;

        for (int i=0; i<years*12; i++) {
            if(i>0) {
                tempNumber = tempNumber*base;
                
            }
        }

        result = loanAmount*((percentage*tempNumber)/(tempNumber-1));
        this.monthlyPayment = result;
    }
}
