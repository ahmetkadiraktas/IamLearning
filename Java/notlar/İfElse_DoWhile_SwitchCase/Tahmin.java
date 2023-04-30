//Write a program that randomly generates two integers under 100 and prompts the user to enter the product of these two integers. The program then reports true if the answer is correct, false otherwise.


import java.util.Scanner;

public class Tahmin {

    public static void main(String[] args) {
        
        
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 20);

        System.out.println("What is " + number1 + " * " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        if (number1 * number2 == answer) 
            System.out.println("You are correct!");
        else
            System.out.println("Your answer is wrong\n" + number1 + " * " + number2 + " should be " + (number1 * number2));

        
    }
    
}
