public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    

    public Rectangle(){        
    }
    public Rectangle(double width, double height){
        this.height=height;
        this.width=width;
    }
    public Rectangle(String color, boolean filled, double width, double height ){
        super(color, filled);
        this.width=width;
        this.height=height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getwidth(){
        return width;
    }
    public void setwidth(double width){
        this.height=width;
    }


    public double getArea(){
        return height*width;
    }

    public double getPerimeter(){
        return 2*(height+width);
    }
}
