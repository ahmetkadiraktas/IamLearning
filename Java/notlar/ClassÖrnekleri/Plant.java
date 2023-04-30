import java.util.Random;

public class Plant{
    private int plantNo;
    private double height;
    private int humidityLevel;
    private static int totalPlants;

    public Plant(double height, int humidityLevel){
        this.height=height;
        this.humidityLevel=humidityLevel;
        Random rnd = new Random();
        this.plantNo=rnd.nextInt(10);
        totalPlants++;
    }

    public int getPlantNo() {
        return plantNo;
    }

    public double getHeight(){
        return height;
    }

    public int getHumidityLevel() {
        return humidityLevel;
    }
    
    public static int getTotalPlants() {
        return totalPlants;
    }

    public void waterPlant(int humidityLevel){
        this.humidityLevel += humidityLevel;
        height += 0.2;
    }

    public String getInfo(){
        return("plant no : " + plantNo +" Height: " + height + "  Humidity Level: " + humidityLevel + "  Total Plants: "+ totalPlants );
    }


}