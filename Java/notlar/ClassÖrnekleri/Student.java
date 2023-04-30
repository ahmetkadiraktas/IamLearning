public class Student {
    // özellikler 
    String name;
    int age;
    boolean isJunior;
    char gender;
    
    
    public Student() {
        name = "";
        age = 0;
        isJunior = false;
        gender = 'm';
    }
    // bu method öğrenci bilgilerini bastırır
    public void info() {
        System.out.println("Student: " + name + "\nAge: " + age + "\nGender: " + gender + "\nJunior: " + isJunior + "\n");
    }
    public void addCourseGrade(String string, int i) {
    }
    public void printGrades() {
    }
    public String getAverageGrade() {
        return null;
    }
    public char[] getName() {
        return null;
    }
    public void setAddress(String string) {
    }
}


