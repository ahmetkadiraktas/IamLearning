public class RecursiveMetod {
    public static void main(String[] args) {
        //özyinelemeli = recursive
        //f(1)=1
        //f(2)=f(1)+2
        //...
        //...
        //f(7)=f(6)+7

        System.out.println(r(10));


    }

    static int add (int v){
        int toplam = 0;
        for (int i=1 ; i<=10 ; i++){
            toplam += i;
        }
        return toplam;
    }


    static int r(int x){
        if (x == 1){
            return 1 ;
        }
        return x + r(x-1);
    }


}
