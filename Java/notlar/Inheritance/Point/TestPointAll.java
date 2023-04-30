public class TestPointAll {
    public static void main(String[] args) {
       Point p1=new Point();
       Point p2=new Point(10,30.5);
       
       System.out.println("Distance : " + p1.distance(p2));
       System.out.println("Distance2 : " + Point.distance(p1, p2));
       
       ThreePoint p3=new ThreePoint();
       ThreePoint p4=new ThreePoint(25,30,15);
       
       System.out.println("Distance : " + p3.distance(p4));

    }
}
