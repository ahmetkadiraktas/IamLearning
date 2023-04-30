public class Employee {
    private String name;
    public int slary;
    private int workhours;
    private int hireyear;


    Employee(int slary, int workhours, int hireyear, String name){
        this.name = name;
        this.slary = slary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }


    public double tax (){
        if(this.slary >= 1000){
            return this.slary * 0.03;
        }
        return 0.0;
    }


    public double bonus (){
        int extrahours = workhours - 40 ;
        if(extrahours > 0){
            return 30 * extrahours;
        }
        return 0.0;
    }

    public double incrase (){
        int year = 2022 - this.hireyear;
        if(year < 10){
            return slary * 0.05;
        }
        else if (year >= 10 && year <= 20){
            return slary * 0.10;
        }
        else{
            return slary * 0.15;
        }
    }






}
