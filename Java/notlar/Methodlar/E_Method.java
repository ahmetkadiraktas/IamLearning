import java.util.Scanner;

public class  E_Method {
    public static void main(String[] args) {
        Scanner asd = new Scanner(System.in);
        System.out.println("3 sayı giriniz");
        int a = asd.nextInt();
        int b = asd.nextInt();
        int c = asd.nextInt();
        
        int max = maxThreeints (a,b,c);
        System.out.println("bunlardan en büyüğü : "+max);
        int fact = aradım (a);
        System.out.println("birincinin faktöriyeli : "+ fact);        
    }
    public static int maxThreeints (int a,int b,int c){
        if((a>=b) && (a>=c))
      return a; 
        else if ((b>=a) && (b>=c))
      return b; 
        else 
      return c;
    }

    public static int aradım (int a){
        int res = 1;
        for(int i=1;i<=a;i++)
         res*=i;
        return res;

    }



    
}