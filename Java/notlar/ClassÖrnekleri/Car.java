public class Car {
    String model;
    String color;
    int speed;

    public Car(){
        model="";
        color="";
        speed=0;
    }

     public Car(String newModel, String newColor, int newSpeed){
        model=newModel;
        color=newColor;
        speed=newSpeed;
    }

    public void increseSpeed(int newSpeed){
        speed=speed+newSpeed;
    }

     public void decreaseSpeed(int newSpeed){
        speed=speed-newSpeed;
    }

}
