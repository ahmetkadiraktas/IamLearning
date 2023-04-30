public class ThreePoint extends Point{
    private double z;

    public ThreePoint() { 
    }
    
    public ThreePoint(double x, double y, double z) {
       super(x,y);
       this.z = z;
    }
 
    public double getZ() {
       return z;
    }
    public double distance(ThreePoint secondPoint) {
        return distance (this, secondPoint);
    }
 
    public static double distance(ThreePoint p1, ThreePoint p2) {
        return Math.sqrt( (p2.getX()-p1.getX())*(p2.getX()-p1.getX()) + (p2.getY()-p1.getY())*(p2.getY()-p1.getY()) + ( (p2.z-p1.z)*(p2.z-p1.z) ) ) ;
    }
 
 
}
