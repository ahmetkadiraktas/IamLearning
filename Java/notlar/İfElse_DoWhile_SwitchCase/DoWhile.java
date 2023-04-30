import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        //asal sayı bulma
        
        Scanner scan = new Scanner(System.in);
        int input;
        boolean asal = true;
        do{ 
            System.out.println("pozitif sayı giriniz:");
            input = scan.nextInt();
        }while(input < 2);
        
        for(int i=2; i< input; i++){
            if(input%i==0){
                asal = false;
                break;
            }
        }
        if(asal){
            System.out.println(input +" asaldır.");
        }
        else{
            System.out.println(input +" asal değildir.");
        }
    } 

    




}
