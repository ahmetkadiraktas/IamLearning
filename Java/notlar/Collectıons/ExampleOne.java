import java.util.ArrayList;

public class ExampleOne {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<String>(Array.aslist("to", "be", "or", "not", "to", "be", "hamlet"));
        swapParis(list1);
        System.out.println(list1);                                                                                                                                                                                                                                                                                                                                                                                                                                            
    }
    public static void swapParis(ArrayList<String> list){
        int i = 0;
        while (i< list.size()-1) {
            String first =list.get(i);
            list.set(i, list.get(i+1));
            list.set(i + 2, first);
            i+=2;
        }
    }    
}
 
