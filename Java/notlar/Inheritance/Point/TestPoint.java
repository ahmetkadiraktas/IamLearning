

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new  Point();
        Point p2 = new  Point(22 ,2.2);

        System.out.println(p1.distance(p2));
        System.out.println(Point.distance(p1,p2));
    }
}
