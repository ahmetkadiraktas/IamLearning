public class Class {
    public static void main(String[] args) {

        //sınıfadı objeadı = new sınıfadı();

        /*
        ClassHesapMakinesi makine = new ClassHesapMakinesi();
        makine.sayi1 = 10;
        makine.sayi2 = 8;
        System.out.println(makine.sayi1);

        ClassHesapMakinesi makine2 = new ClassHesapMakinesi();
        makine.sayi1 = 20;
        makine.sayi2 = 4;
        System.out.println(makine.sayi1);
        */

        ClassHesapMakinesi makine3 = new ClassHesapMakinesi(1,3);
        //constructor (yapıcı)
        System.out.println(makine3.sayi1+"-"+makine3.sayi2);

        makine3.sayi2 = 5;
        System.out.println(makine3.sayi2);


        ClassHesapMakinesi m4 = new ClassHesapMakinesi(10,5);
        //toplamatyı buraya çağralım
        m4.toplama();
        System.out.println(m4.toplama());
        m4.sayi1 = 3 ;
        System.out.println(m4.toplama());


        //nesnelere renk verbilirsin
        //        ClassHesapMakinesi m4 = new ClassHesapMakinesi(10,5,"mavi");
        //diğer kısımda da yapman gereken işlemler var.


    }
}
