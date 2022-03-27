/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.calculation.up.to.the.entered.number;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class FactorialCalculationUpToTheEnteredNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact =1;
        
        System.out.println("Enter the number:  ");
        int num = s.nextInt();
        
        for(int i =1;i<=num;i++){
        fact = fact * i ;
        
        System.out.println(i + "!=" +fact );
        }
        
        // TODO code application logic here
    }
    
}
