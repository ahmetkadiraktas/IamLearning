//Kullanıcının girdiği tamsayı değerine göre farklı iller görüntüleyen bir program yazınız. Switch ifadesini kullan 

import java.util.Scanner;
public class SwitchCaseDemoo {
    public static void main(String[] args) {
        

        Scanner kb = new Scanner (System.in);
        System.out.println("Enter your choice");
        int choice = kb.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Adana");
                break;
                case 2:
                System.out.println("istanbul");
                    break;
                    case 3:
                    System.out.println("Ordu");
                        break;
                        case 4:
                        System.out.println("Muş");
                        break;
                    
            default: System.out.println("Invalid Input ");

                break;
        }
        
    }

    
}
