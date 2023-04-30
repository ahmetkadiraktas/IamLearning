import java.util.*;


public class LinkdHashSet {
    public static void main(String[] args) {
        //hashSetten tek farkı sıraşlama karmaşık değil girilen sırayla saklaması.
        LinkdHashSet days = new LinkdHashSet();

        days.add("Pazaartesi");
        days.add("salı");
        days.add("çarşamba");
        days.add("perşembe");
        days.add("cuma");
        days.add("cumartesi");
        days.add("pazar");

        days.add("pazartesi");

        //days.forEach(item -> System.out.println(item + ","));
    }

    private void add(String string) {
    }

}
