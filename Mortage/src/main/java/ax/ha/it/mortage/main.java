/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ax.ha.it.mortage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author André
 */
public class main {
    
    public static void main (String[] args) {
        CustomerManager test = new CustomerManager();
        File file = new File("src/main/resources/prospects.txt");
        test.getDataFromFile(file);
        test.iterate();
    }
}
