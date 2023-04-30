import java.util.Scanner;

public class SwitchCaseMenü {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("Enter C for Cheeseburger");
        System.out.println("Enter H for Hot dog");
        System.out.println("Enter L for Lemonade");
        System.out.println("Enter T for Iced Tea");
        System.out.println("Enter your choice");

        String tempStr=kb.next();
        char choice =tempStr.charAt(0);
        

        switch (choice) {
            case 'C':  System.out.println("Cost of a Cheeseburger is $7.49"); break;
            case 'H':  System.out.println("Cost of a Hot dog is $6.99"); break;
            case 'L':  System.out.println("Cost of a Lemonade is $2.50"); break;
            case 'T':  System.out.println("Cost of a Iced Tea is $2.75"); break;
            default: System.out.println("Unrecognized menu item.");
        }
}

    
}
