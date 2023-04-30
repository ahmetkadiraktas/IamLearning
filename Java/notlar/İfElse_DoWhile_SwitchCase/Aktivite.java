//Write a program that prompts the user to enter the outside temperature value and proposes an appropriate activity.

import java.util.Scanner;

public class Aktivite {
     public static void main(String[] args) {
        
    
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the outdoor temperature value");
        int temp = input.nextInt();

        if (temp>25) 
         System.out.println("You can go swimming");
        else if (temp>=18 && temp<=25)
         System.out.println("You can go jogging");
        else if (temp>=11 && temp<=17)
         System.out.println("You can go to cinema");
        else if (temp>=0 && temp<=10)
         System.out.println("You can go skiing");
       else
         System.out.println("I don’t know what to do"); 
   
        

    }
 
    
}
