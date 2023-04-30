import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthStyle;

import org.graalvm.compiler.lir.aarch64.AArch64ArrayCompareToOp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("İlk okunan kod kısmı maindir."+
        "Bu yüzden kodları buraya yazar kalanlarını buraya çagrırsın");
        //ln eklemek yazının satır atlamasına sebeb olur . 
        //ayrıca yazının sonuna /n eklemekte satır atlatır.
        //ayrıca yazının sonuna /t eklemekte bir tablık boşluk bırakır.

        System.out.println(10);
        System.out.println(10+15);
        //bu şekilde yazarsan matamatiksel işlemleri yaparsın.
        System.out.println(10+"15");
        //fakat bu şekilde çalışmaz


        //bir değişkenin 4 özeliği vardır ; TİP,İSİM,DEĞER,ADRES.
        // genel tanımlama şekli  "veriTipi değişkenİsmi = değişkenDeğeri;"

        //byte   8  bit 
        //short  16 bit
        //ınt    32 bit
        //long   64 bit
        

        //float  32 bit   ondalıklı sayılar için  hız ve bellek açısından karlıdır.
        //double 64 bit   ondalıklı sayılar için  yüksek duyarlılıklı işlemlerde kıllanılır.


        //char   16 bit   karakterleri saklar ve tüm dilleri içerir

        //booleam  mantıksal değerleri saklamak için kullanılır. Sadece iki değer saklar true ve false


        byte yüz = 100 ;
        System.out.println(yüz);
        //Tırnak içinde yazma.

        short kk = 1000;
        System.out.println("okunan kitap sayısı:"+kk);
        // + koymayı unutma


        int intdeger = 123456;
        System.out.println(intdeger);

        long longdeger = 123456789 ;
        System.out.println(longdeger);

        float den = 35.2f;
        System.out.println(den);
        //doubleden ayırması için sonuna büyük yada küçük f koy

        double deen = 3.222222222;
        System.out.println(deen);
        //deen olarak tanımladıgımız değişkeni değiştirmek istiyorsanız türünü tanımlamadan yap
        deen = 3.55555555;
        System.out.println(deen);
        System.out.println("deen iki farklı şekilde yazıldı çünkü java kodları sra ile okur");



        char asz = 'u' ;
        System.out.println(asz);


        boolean mantık = true;
        System.out.println(mantık);
        // boolean iki deger alabilir true ve false


        String metin ="bu aslında charlardan oluşan bir paketdir";
        System.out.println(metin);


        //oparatörler
        int n = 5;
        int m = 6;
        int toplam = n+m;
        System.out.println("toplam:"+toplam);
        int cikarma = n-m;
        int carpma = n*m;
        int bolme = n/m;
        int mod = m%n;
        System.out.println("mod alma : "+mod);
        toplam++;
        System.out.println("toplam degerini 1 arttırdım: "+toplam);


        //aşagıdaki gibi yaparsan önce n ve m toplar sonra bir artırır
        int toplama2 = n++ + m++ ;
        System.out.println(toplama2);


        //ama ++ yı başa koyarsan önce artırır sonra toplar
        int toplama3 = ++n + ++m;
        System.out.println(toplama3);
        // hem yukarıda hemde şimdi artırıldıgı için n ve m iki artırılmış oldu büyzden sonuç 15 çıktı


        int r = 10;
        int t = 20;
        boolean yusuf = (r==t) ;
        System.out.println(yusuf);
        boolean asdf = (r!=t);
        System.out.println(asdf);
        

        boolean kosul1 = (r<t);
        String sonuc = (kosul1) ? "istedigini" : "Yazabilirsin" ;
        System.out.println(sonuc);
        // koşul operatörleri 

        //bir sayıyı artırmak için 
        int ornek1 = 5;
        ornek1  += 3;
        System.out.println(ornek1);

       


        //konsaldan veri alma
        
        System.out.println("boyunuzu giriniz");
        Scanner input = new Scanner(System.in);
        int boyunuz;
        /*
        boyunuz = input.nextInt();
        System.out.println("kilonuzu giriniz");
        int  kilonuz;
        kilonuz = input.nextInt();
        int toplamları = kilonuz+boyunuz;
        System.out.println("toplamları"+toplamları);

        //kdv hesplayan program
        int tutar , kdvlifiyat , kdv=8 ;
        System.out.println("Ürün fiyatını giriniz:");
        tutar = input.nextInt();
        kdvlifiyat = tutar + (tutar*kdv);
        System.out.println(kdvlifiyat);
        */



        //Koşullu ifadeler
        boolean aasdf = r!=t;
        System.out.println("DEğer doğru olmalı fakat başına ünlem koydugum için değilini alacak  "+ !aasdf);

/*
        //if else blokları
        int cq = 1453;
        int aq = 4564;
        int bq ;
        System.out.println("şifreyi giriniz");
        bq = input.nextInt();

        if(aq==bq) {
            System.out.println("şifre doğru");
        }
        else if(cq==bq) {
            System.out.println("aynı şifreyi kullanırmıyım salak");
        }
        else {
            System.out.println("şifre yanlış");
        }
*/



        
        


        


        


        



     




        








        




          












    }    
}
