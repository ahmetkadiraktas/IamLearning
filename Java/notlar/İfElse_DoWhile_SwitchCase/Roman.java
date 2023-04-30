//Write a program that reads an integer between 1 and 9 and displays the roman version (I, II, : : :, IX) of that integer.

import java.util.Scanner;

public class Roman {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        System.out.println("1-9 arası bir sayı giriniz");
        int sayı = asd.nextInt();


        if(sayı==1)
       System.out.println("Roman Version: I");
     else if(sayı == 2)
       System.out.println("Roman Version: II");
     else if(sayı == 3)
       System.out.println("Roman Version: III");
     else if(sayı == 4)
       System.out.println("Roman Version: IV");
     else if(sayı == 5)
       System.out.println("Roman Version: V");
     else if(sayı == 6)
       System.out.println("Roman Version: VI");
     else if(sayı == 7)
       System.out.println("Roman Version: VII");
     else if(sayı == 8)
       System.out.println("Roman Version: VIII");
     else if(sayı == 9)
       System.out.println("Roman Version: IX");
     else
       System.out.println("Invalid value");



    }
    
}
