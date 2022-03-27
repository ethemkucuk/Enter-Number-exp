/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding.squares.of.numbers.up.to.the.entered.number;


import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class FindingSquaresOfNumbersUpToTheEnteredNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int square;
        
        System.out.print("Enter the number ");
        int num = s.nextInt();
        
        for(int i =1;i<=num;i++)
        {
            square = i*i;
                    System.out.println(i + " square = " + square);
        }
        
        // TODO code application logic here
    }
    
}
