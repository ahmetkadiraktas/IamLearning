//          subclass           superclass
public class Circle extends GeometricObject {
    private double radius;

    public  Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }


    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }


    public double getArea(){
        return radius*radius*radius*radius*Math.PI;
    }
    public double getDiameter(){
        return radius*2;
    }
    public double getPrimeter(){
        return 2*radius*Math.PI;
    }


    public void printCircle(){
        System.out.println(" The circle is created " + getDataCreated() + " and the radius is " + radius);
    }
}
