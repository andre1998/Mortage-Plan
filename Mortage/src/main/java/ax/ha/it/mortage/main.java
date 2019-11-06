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
public class main {
    public static void main (String[] args) {
        customer first = new customer("juha", 1000, 5, 2);
        System.out.println(first.getLoan());
        System.out.println(first.getInterest());
        System.out.println(first.getYears());
        System.out.println(first.getMonthlyPayment());
    }
}
