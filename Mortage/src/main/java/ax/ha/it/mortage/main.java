/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

import java.io.File;


/**
 *
 * @author André
 */
public class main {
    
    public static void main (String[] args) {
        /*Customer test = new Customer("John, Test Case", 1000, 5, 2);
        System.out.println(test.getName());*/
        CustomerManager test = new CustomerManager();
        File file = new File("src/main/resources/prospects.txt");
        test.getDataFromFile(file);
        System.out.println(test.get(1).getName());
        /*test.iterate();
    */
    }
}
