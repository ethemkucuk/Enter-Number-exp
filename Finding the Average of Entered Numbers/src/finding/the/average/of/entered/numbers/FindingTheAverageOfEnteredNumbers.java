/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finding.the.average.of.entered.numbers;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class FindingTheAverageOfEnteredNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num , all=0;
        
        System.out.print("Enter the number of numbers you want to enter: ");
        int num2 = s.nextInt();
        
        for(int i =0;i < num2;i++)
        {
            System.out.println((i+1) + ".number enter");
            num=s.nextInt();
            all += num;
            
        }
        System.out.println("Average of numbers = " + ((float)all / num2));
        
        
        // TODO code application logic here
    }
    
}
