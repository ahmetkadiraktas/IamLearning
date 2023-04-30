public class Point {
    
    private double x;
    private double y;

    public Point() { 
    }
   
    public Point(double x, double y) {
    this.x = x;
    this.y = y;
    }

    public double getX() {
    return x;
    }

    public double getY() {
    return y;
    }
    public double distance(Point secondPoint) {
        return distance (this, secondPoint);
    }
     
    public static double distance(Point p1, Point p2) {
        return Math.sqrt( (p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
    }
     

}
