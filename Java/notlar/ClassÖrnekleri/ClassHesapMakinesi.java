public class ClassHesapMakinesi {
    public int sayi1 ;
    public int sayi2;

    /*private int sayi;
    bu şekilde yazarsan adı üstünde bu class a özel olur
    başka classlar tarafından çağrılamaz değiiştirilemez.*/


    /*nesnelere renk verme   
         buraya bir string atamak lazım (  public String renk;  )
    sonra dışarıdaki stringle içeride ki stringi eşleştirmelisin (  ClassHesapMakinesi(int sayi1, int sayi2, String renk){
                                                                        this.renk = renk ; )
*/

    ClassHesapMakinesi(int sayi1, int sayi2){
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;

        //this bu clasda ki this anlamınada gelir

    }

    public int toplama(){
        return this.sayi1 + this.sayi2;
    }

    public int çıkartma(){
        return this.sayi1 - this.sayi2;
    }

    public int çarpma(){
        return this.sayi1 * this.sayi2;
    }

    public int bölme(){
        return this.sayi1 / this.sayi2;
    }

    public int ustalma (){
        int result = 1;
        for(int i=1 ; i <= this.sayi2 ; i++ ){
            result *= this.sayi1;
        }
        return result;
    }




}
