/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial_calculation;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Factorial_calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact =1;
        
        System.out.println("Bir sayı giriniz: ");
        int num = s.nextInt();
        
        for(int i = 1;i<=num ; i++)
        {
            fact = fact *i;
        }
        System.out.println(num + "!= "+fact);
        // TODO code application logic here
    }
    
}
