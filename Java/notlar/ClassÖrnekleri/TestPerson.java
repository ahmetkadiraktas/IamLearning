import java.util.zip.ZipEntry;

public class TestPerson {
    public static void main (String args[]){
        Person p = new Person();
        p.setName("Mario");
        p.setAge(32);
        System.out.println("Person Name: " + p.getName());
        System.out.println("Person id: " + p.getId());
        System.out.println("Person Age: " + p.getAge());


        Person z = new Person();
        z.setName("ahmetfaruk");
        z.setAge(42);
        System.out.println("Person Name: " + z.getName());
        System.out.println("Person id: " + z.getId());
        System.out.println("Person Age: " + z.getAge());

    }
}