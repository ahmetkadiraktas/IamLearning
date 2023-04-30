public class TestSutudent2 {
    public static void main(String[] args) {

        Student2 stu1 = new Student2("Zeynep Kaya", "Üsküdar");
        System.out.println(stu1.toString());  
  
        stu1.setAddress("Acıbadem");
        System.out.println(stu1.toString());
   
        System.out.println(stu1.getName());
        System.out.println(stu1.getClass());
  
        stu1.addCourseGrade("SE201", 89);
        stu1.addCourseGrade("COME201", 57);
        stu1.addCourseGrade("COME205", 96);
        
        stu1.printGrandes();
  
        System.out.print("The average grade is " + stu1.getAverageGrade());
  
     }
  
}
