public class TestCar {
    public static void main(String [] args){
        Car c1=new Car();
        System.out.println("Model: " + c1.model + " Color: " + c1.color + " Speed: " + c1.speed);
        c1.increseSpeed(10);
        System.out.println(" New Speed: " + c1.speed);
        
        int speed=(int)(Math.random()*61+20); 
        Car c2=new Car("Sedan", "Red", speed);
        System.out.println("Model: " + c2.model + " Color: " + c2.color + " Speed: " + c2.speed);
        c2.decreaseSpeed(25);
        System.out.println(" New Speed: " + c2.speed);
    }

}
