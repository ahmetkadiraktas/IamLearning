import java.text.BreakIterator;
import java.util.Scanner;


public class Atm {

    public static void main(String[] args) {
        int bakiye = 1500, input , miktar ;
        Scanner scan = new Scanner(System.in);
        System.out.println("AKTAŞ Bankasına HOŞGELDİNİZ");
        System.out.println("Güncel bakiyeniz" + bakiye + "TL");

        while ( bakiye >0){
            System.out.println();
            System.out.println("1-)para yatır");
            System.out.println("2-)para çek");
            System.out.println("3-)bakiye sorgula");
            System.out.println("4-)çıkış yap");
            System.out.println("yapmak istediğiniz işlemi seçiniz");            
            input = scan.nextInt();


            if(input == 1){
                System.out.println("yatırmak istediğiniz bakiye");
                miktar = scan.nextInt();
                bakiye += miktar;
            }else if(input == 2) {
                System.out.println("çekmek istediğiniz miktar");
                miktar = scan.nextInt();
                if(miktar > bakiye){
                    System.out.println("hesabınızda yeteri kadar para bulunmamakta.");
                    System.out.println("lütfen"+ bakiye + "tlden daha az bir miktar giriniz.");
                }else{
                    bakiye -= miktar;
                }
            }else if(input==3) {
                System.out.println("bakiyeniz"+ bakiye + "tldir.");
            }else if (input==4){
                System.out.println("çıkış yapılıyor.");
                break;
            }else{
                System.out.println("gecerlisi bir işlem girdiniz");
            }
            System.out.println("güncel bakiyeniz : " + bakiye );
            System.out.println("tekrar bekleriz");
        
        }






    
        
    }
    
}
