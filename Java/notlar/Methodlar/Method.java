import javax.sql.rowset.spi.SyncResolver;

public class Method {
    public static void main(String[] args) {

        System.out.println("deneme");
        f(4);
        System.out.println("ikinci method : (bir methodu birden fazla yerde kullana bilirisin");
        f(8);

        power (3,5);

    }

    
    static void f(int x){
        int result = (x+2)*6 ;
        System.out.println(result);

    } 
    static void power(int number1, int number2){
        int result = 1;
        for(int i=1 ; i <= number2 ; i++ ){
            result *= number1;
        }
        System.out.println(result);
    }
    // birden fazla çalışacak kodu bu yöntele tek sefer yamış olursun bu sayede karışıklık azalır.
    
}
