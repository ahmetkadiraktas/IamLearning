import java.util.*;

    public class TreeSet {
      private Object forEach;

    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(10);
        tree.add(2);
        tree.add(3);
        tree.add(6);

        tree.forEach (item -> System.out.println(item));
    }

    private void add(int i) {
    }
    
}
