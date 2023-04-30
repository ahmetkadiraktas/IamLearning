import java.util.Collection;

public class Array {
    public static void main(String[] args) {
        //arraylaer aşşğıda ki şekilllerde tanımlana bilir.
        /*   veritipi diziadı[] = new veritipi [elemansayısı]
             veritipi[] diziadı = new veritipi [elemansayısı] 
             veritipi[] diziadı = {v,v1,v2}                     */



        //multidimensionalArray
        //  ->çok boyutlu diziler
        
        int [][] tablo = new int [][]{
            {1,75,10},{2,87,13},{3,95,15},{4,103,18}
        };

        //oluşan tablo
        /*       1  17   10
                 2  87   13
                 3  95   15
                 4  103  18        */
        
        
        // değerleri elle girmek istersen

        int [][] tablo2 = new int [2][3];
        tablo2[0][0] = 1;
        tablo2[0][1] = 2;
        tablo2[0][2] = 3;
        tablo2[1][0] = 4;
        tablo2[1][1] = 5;
        tablo2[1][2] = 6;

        //oluşan tablo
        /*       1  2  3
                 4  5  6    */

        
        //tablo biri yazdıralım


        for(int i=0; i<tablo.length; i++){
            for(int k=0; k<tablo[0].length; k++){
                System.out.print(tablo[i][k]+" ");
            }
            System.out.println();
        }


        
     
             
    }

    public static Collection<? extends String> aslist(String string, String string2, String string3, String string4,
            String string5, String string6, String string7) {
        return null;
    } 
    
}
