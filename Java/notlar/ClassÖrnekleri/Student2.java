import java.sql.Date;

public class Student2 {
    private String name;
    private String address;
    private String[] courses;
    private int[] grades;    
    private static final int MAX_COURSES = 30;  
    private int numCourses;  
    private static int studentCounter = 1000;
    public final int stuId; 
    public Date dateRegistered;

    public Student2() {
        this("","");
    }

    public Student2(String name, String address) {
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];  // allocate arrays
        grades = new int[MAX_COURSES];
        numCourses = 0;                     // no courses so far
        this.stuId = ++studentCounter;
        this.dateRegistered = new Date(System.currentTimeMillis());
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString() {
        return "Name: " + name + " ID: " + stuId +  " Address: " + address + " Registration Date" + dateRegistered;
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public double printGrandes(){
        int sum = 0;
        for (int i = 0 ; i<numCourses; ++i){
            sum += grades[i];
        }
        return (double) sum/numCourses;
    }

    public String getAverageGrade() {
        return null;
    }


}
