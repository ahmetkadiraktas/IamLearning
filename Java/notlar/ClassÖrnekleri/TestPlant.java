public class TestPlant {
    public static void main(String[] args) {
        Plant p = new Plant(1.5, 3);
        p.waterPlant(2);

        System.out.println("Height: " + p.getHeight() + "  Humidity Level: " + p.getHumidityLevel());
        System.out.println(p.getInfo());

        Plant p2 = new Plant(3.0, 5);

        System.out.println("Total Plants: " + Plant.getTotalPlants());
    }
}
