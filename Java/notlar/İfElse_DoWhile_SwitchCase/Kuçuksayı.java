import java.util.Scanner;

public class Kuçuksayı {
     public static void  main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         // küçük sayı bulucu
        System.out.println("gireceginiz üç sayıan en küçük olanı bulucam");
        int bir , iki , üç ;
        System.out.println("birinci sayıyı girin");
        bir = input.nextInt();
        System.out.println("ikincici sayıyı girin");
        iki = input.nextInt();
        System.out.println("üçüncü sayıyı girin");
        üç = input.nextInt();
        input.close();

        if((bir<iki) && (bir<üç)){
            System.out.println(bir+" en küçük sayıdır");
        }
        else if((iki<bir) && (iki<üç)){
            System.out.println(iki + " en küçük sayıdır");
        }
        else if((üç<bir) && (üç<iki)){
            System.out.println(üç +" en küçük sayıdır");
        }
        else {
            System.out.println("farklı sayılar giriniz");
        }


        
        







         
     }
         
     
}
