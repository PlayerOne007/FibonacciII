/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciii;

import java.util.Scanner;

/**
 *
 * @author cdeme
 */
public class FibonacciII {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter the amount of numbers to be printed");
      //When the code is executed, this is presented to input a number in this case 90.
        Scanner ob = new Scanner(System.in);//Used to input numbers
        int a = 1;
        int b = 0;
        int ch = ob.nextInt();
        

        while (ch < 0 || ch > 90) {
        System.out.println("Wrong number, try again.");
        ch = ob.nextInt();
    }
    for(int i = 0; i < ch; i++){
        System.out.print(b);
        b = a + b;
        a = b - a;
        if(i <= ch - 2){
            System.out.print(", ");//No commas
            
        }
            
          
        if(i == ch - 1){
            System.out.print(".\nThese are the first " + ch + " Fibonacci Numbers!");
            //Lists out all numbers with commas
           
            }
       
        
        
          
          
      
        
    }
        
            
        }
    }
   

