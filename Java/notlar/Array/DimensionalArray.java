/* Write a program that creates a two dimensional array with 5 rows and 5 columns. 
Fill this array with random integer values, prints the content of the array, compute and display the column sum sum of the array.      */

public class DimensionalArray {
    public static void main(String[] args) {
        int [][] myList = new int [5][5] ;
        for(int row=0; row<myList.length; row++){
            for(int col=0; col<myList[row].length; col++){
                myList[row][col] = (int) (Math.random()*100);
            }
        }

        for(int row=0; row<myList.length; row++){
            for(int col=0; col<myList[row].length; col++){
                System.out.print(myList[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int col=0; col<myList[0].length; col++){
            int sum = 0 ;
            for(int row=0; row<myList.length; row++){
                sum += (myList[row][col]);
            }
            System.out.println("sum of colm " + (col+1) + " is " + sum);
        }

    }
    
}
