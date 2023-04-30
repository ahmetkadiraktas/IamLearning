import javax.lang.model.util.ElementScanner6;

public class Palindorom {
    public static void main(String[] args) {
        // palindorom = tersi kendine eşit olan sayılar
        System.out.println(isPalindrom(123321));
        System.out.println(isPalindrom(123421));

    }
    
    static boolean isPalindrom (int input) {
        int tmp, kalan, terssayi=0;
        tmp=input;

        while(tmp != 0){
            kalan = tmp % 10;
            terssayi = terssayi*10 + kalan;
            tmp /= 10;
        }

        if (input == terssayi)
            return true;
        else
            return false;
    }
}
