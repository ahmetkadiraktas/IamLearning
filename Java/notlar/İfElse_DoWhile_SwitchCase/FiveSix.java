//Write a program that displays all the numbers from 1 to 100, that are divisible by 5 and 6.

public class FiveSix {
    public static void main(String[] args) {
        int canımınici = 1;
        while(canımınici < 101){
            if(canımınici%5==0 && canımınici%6==0)
              System.out.println(canımınici+"");
              canımınici++;
        }
    }
    
}
