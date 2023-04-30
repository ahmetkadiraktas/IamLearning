//Write a program that generates 60 random integers in interval [0,100]. Your program computes the average of the numbers that are divisible by 3.

public class UçOrtalama{
    public static void main(String[] args) {
        int sonuclar=0 , sayılar=0; 
        for (int i=1;i<60 ; i++){
            int a = (int)(Math.random()*101);
            if (a%3==0){
                sonuclar = sonuclar+a;
                sayılar = sayılar+1;

            }
        }
    double average= (double) sonuclar/sayılar;
    System.out.println("avrage:"+ average);

    }

}