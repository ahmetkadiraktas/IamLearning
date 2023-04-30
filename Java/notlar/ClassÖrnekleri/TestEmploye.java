public class TestEmploye {


    public static void main(String[] args) {
        Employee emp1 = new Employee(2000, 45, 2000, "kadir");
        System.out.println("tax : "+ emp1.tax());
        System.err.println("bonus : "+ emp1.bonus());
        System.out.println("incrase salary : "+ emp1.incrase());

        double totalSlary = emp1.slary - emp1.tax() + emp1.bonus();
        System.err.println("total salary : " + totalSlary);
    }

}
