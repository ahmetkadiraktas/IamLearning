public class Cat {
    public int x ;
    public double direction ;
    public String name ;
    public int a;

    public Cat() {
        this (0,90.0,"alice");
    }

    public Cat(int x, double direction, String name) {
        this.x = x ;
        this.direction = direction ;
        this.name = name ;

    }

    public void move(){
        x += 10 ;
    }

    public void move2(int a){
        x += a ;
    }

    public void turn(double angle){
        direction += angle;
    }

    public void status(){
        System.out.println("Name: " + name + " x: " + x + " direction: " + direction);
    }

}
