public class TestStudent {
    public static void main(String[] args){

        Student s = new Student();

        System.out.println(s.age);
        System.out.println(s.name);

        System.out.println("---------------------");

        s.age = 15;
        s.name = "Ayşe";
        s.gender = 'f';
        s.isJunior = true;

        System.out.println("---------------------");

        System.out.println(s.age);
        System.out.println(s.name);

        System.out.println("---------------------");

        s.info();
      }
    
}
