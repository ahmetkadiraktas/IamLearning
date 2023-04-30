public class TestCat {
    public static void main(String[] args) {
        // Create two cat objects 
        Cat c1 = new Cat();
        Cat c2 = new Cat(5,45,"Lucy");

        // Move the cats 
        c1.move();
        c2.move2(20);

        // Print the status of cats
        c1.status();
        c2.status();
    }
}
