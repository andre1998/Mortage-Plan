/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author André
 */
public class CustomerManager {
    private List<Customer> customerList;
    
    public CustomerManager() {
        customerList=new ArrayList<>();
    }
    
    public void iterate() {
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(2);
        
        for (int i=0; i<customerList.size(); i++) {
            System.out.println("Prospect "+(i+1)+": "+customerList.get(i).getName()
                                +" wants to borrow "+customerList.get(i).getLoan()+"€ for a period of "
                                +customerList.get(i).getYear()+" years and pay "+format.format(customerList.get(i).getMonthlyPayment())+"€ for each month");
            //Prospect 1:  wants to borrow € for a period of  years and pay E € each month
        } 
    }
    
    public void append(Customer customer) {
        customerList.add(customer);
    }
    
    public void remove(int index) {
        customerList.remove(index);
    }
    
    //Primär funktion som lägger in all data
    public void getDataFromFile(File file) {
        int counter = 0;
        boolean check = false;
        String name;
        double loan;
        double interest;
        int years;
        //nameExtra används när det förekommer flera , tecken
        String nameExtra;
        
        try {

        Scanner reader = new Scanner(file);
        
        reader.useDelimiter(",");
        while (reader.hasNextLine()) {
            //Kollar om loopen har körts tidigare, om den inte har gjort det så läser den in en extra gång för att skippa första raden i .txt filen
            if (check==false) {
                reader.nextLine();
                //Sätter true på kontrollen
                check=true;
            }
            
            String string = reader.nextLine();
            Scanner finder = new Scanner(string);
            finder.useDelimiter(",");
            
            //Räknar antalet , tecken för att avgöra hur datan skall sättas in i kontstruktorn
            counter = string.length() - string.replace(",", "").length();
            
            if (counter==3) {
                name = finder.next();
                loan = Double.parseDouble(finder.next());
                interest = Double.parseDouble(finder.next());
                years = Integer.parseInt(finder.next());
                
                Customer temp = new Customer(name, loan, interest, years);
                temp.setMonthlyPayment();
                append(temp);
            }
            else if (counter >= 3) {
                //finder.useDelimiter(",");
                nameExtra = finder.next()+" "+finder.next();
                
                name=nameExtra.replace("\"","");
                loan = Double.parseDouble(finder.next());
                interest = Double.parseDouble(finder.next());
                years = Integer.parseInt(finder.next());
                
                Customer temp = new Customer(name, loan, interest, years);
                //Sätter värdet för monthlyPayment
                temp.setMonthlyPayment();
                append(temp);
            }
            //Sätter counter till noll inför nästa rad som läses in;
            counter = 0;

        } 
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
