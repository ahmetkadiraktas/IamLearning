public class Matrix {
    public static void main(String[] args) {
        int [][] mymatrix = new int [5][5];
        for (int row =0; row< mymatrix.length; row++){
            for (int col=0; col<mymatrix[row].length; col++){
                mymatrix [row][col]= (int) (Math.random()*100);

            }
        }
        for (int row =0; row< mymatrix.length; row++){
            for (int col=0; col<mymatrix[row].length; col++){
                System.out.print(mymatrix[row][col]+" ");

            }
            System.out.println("");
        }
        for ( int col=0; 0<mymatrix.length; col++){
            int toplam = 0;
            for (int row=0; row<mymatrix.length; row++){
                toplam +=(mymatrix[row][col]);
            }
            System.out.println((col +1)+"sütünün toplamı"+toplam);
        }
    }
}
