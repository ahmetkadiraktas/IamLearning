import java.util.*;

public class HashSet {

    public static void main(String[] args) {

        //HashSet f(x) = x^2 * xmod7 * x    gibi karmaşık fonksiyonlar gibidir.
        //HasshSet ekleme sırasısına göre kaydetmez. Hashleme yöntemine göre farklı kayıt alır.

        HashSet h = new HashSet();
        h.add("12");
        h.add(12); //burada hem string hem integer deger girdik ama sıkıntı yapmadı
        h.add(12.00);
        h.add(true);
        h.add(null);
        //h.add("12"); diye bir kod daha ekleyemeyiz çünkü hash setler bir elemandan yanlızca bir tane bulundura bilir.

        // h.remove(0); ilk elemanı silmesini bekliyoruz ama silmedi çünkü hashsetde sıralama yok.
        h.remove("12"); // bu şekilde direk eleman bazlı siler.

        Iterator itr = h.ıterator();

        while(itr.hasNext()){
            System.out.println(itr.next());  
        }
    }

    private void add(invalid invalid) {
    }
    
}
