public class TestPoin2 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(5,10);

        int p1x = p1.getX();
        int p1y = p1.getY();
        int p2x = p2.getX();
        int p2y = p2.getY();
        p1.setX(p1x + p2x);
        p1.setY(p1y + p2y);


        System.out.println("p1: " + p1.toString());

        int x = p1.getX() + p2.getX();
        int y = p1.getY() + p2.getY();
        Point2D p3 = new Point2D(x, y);

        System.out.println("p3: " + p3.toString());

        System.out.println("p1 and p3 is equal: " + p1.equals(p3.getX(), p3.getY()));

    }
}
