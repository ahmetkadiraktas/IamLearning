public class ReturnMethodlar {
    public static void main(String[] args) {
        int sonuc = power2(2,3);
        int islenmisdeger = sonuc * 10 ;
        System.out.println(islenmisdeger);
    }
    //iki çeşit method vardır. 1-) void methodlar 2-) return methodlar


    //1-) void methodlar
    static void power(int number1, int number2){
        int result = 1;
        for(int i=1 ; i <= number2 ; i++ ){
            result *= number1;
        }
        System.out.println(result);
    }
    // ancak başka bir void method içerisinde çalıştırılır.


    //2-) return methodlar

    //void yerine çıktı almak istediğimiz değişkenin türü yazılır.
    static int power2 (int a, int b){
        int result = 1;
        for(int i=1 ; i <= b ; i++ ){
            result *= a;
        }
        return result;
    }
    //yukarıda sonuç metin olarak alınıyordu yani main içinde veri olarak kullanılamayacak durumda. 
    //ancak burada kullanılabilecek durumda alınıyor.
    

    

    
}
