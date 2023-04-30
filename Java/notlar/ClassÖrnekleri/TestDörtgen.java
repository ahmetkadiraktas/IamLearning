import java.util.Scanner;

public class TestDörtgen {
    public static void main(String[] args) {
        Dörtgen r1 = new Dörtgen();
        System.out.println(" Width: " + r1.width + " Height: " + r1.height + " Perimeter: " + r1.calculatePerimeter() + " Area: " + r1.calculateArea());
        
        int []  newDimensions = r1.setDimensions();
        for (int i=0; i<newDimensions.length; i++){
            System.out.println(" "+ newDimensions[i]);
        }

        System.out.println("after setting new dimensions");
        System.out.println(" Width: " + r1.width + " Height: " + r1.height + " Perimeter: " + r1.calculatePerimeter() + " Area: " + r1.calculateArea());


        Scanner kb = new Scanner(System.in);
        System.out.println("Enter width: ");
        int x = kb.nextInt();
        System.out.println("Enter height: ");
        int y = kb.nextInt();
        Dörtgen r2 = new Dörtgen(x, y);

        System.out.println(" Width: " + r2.width + " Height: " + r2.height + " Perimeter: " + r2.calculatePerimeter() + " Area: " + r2.calculateArea());


    }
}