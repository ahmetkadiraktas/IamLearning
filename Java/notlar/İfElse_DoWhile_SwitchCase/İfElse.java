import java.util.Scanner;

public class İfElse {
    public static void main(String[] args) {
        System.out.println("Enter 1 for converting from Celcius to Fahrenheit");
        System.out.println("Enter 2 for converting from Fahrenheit to Celcius");
       
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter your choice: ");
        
        int choice = kb.nextInt();
        System.out.println("Enter your value: ");
        double value = kb.nextDouble();
       
       
        if (choice == 1){
          double fahrenheit = value*(9.0/5)+32;
          System.out.println("Celsius " + value + " is " + fahrenheit + " in Fahrenheit");
        }
        
        else if (choice==2){
         double celsius = (5.0/9)* (value - 32);
          System.out.println("Fahrenheit " + value + " is " + celsius + " in Celsius");
        }
        else
        System.out.println("Invalid choice.");

    }
}


