import java.util.Scanner;

public class Login{
    public static void main(String[] args) throws Exception {
        //kullanıcı adı parola
        Scanner scan = new Scanner(System.in);

        String kullanıcıad , parolaa ;
        System.out.println("kullanıcı adını giriniz :");
        kullanıcıad = scan.nextLine();
        System.out.println("parolayı girinz");
        parolaa = scan.nextLine();
        if(kullanıcıad.equals("kadir") && parolaa.equals("4564")){
            System.out.println("sisteme hoşgeldin kadir");
        }
        else{
            System.out.println("tekrar deneyiniz.");
        }
    }
}