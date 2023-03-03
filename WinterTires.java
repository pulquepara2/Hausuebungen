public class WinterTires {
    public static void main(String[] args) {
        boolean SlipperyRoad;
        int temperature;

        temperature = 25;
        SlipperyRoad = true;

        needWinterTires(temperature,SlipperyRoad);
    }

    public static void needWinterTires(int temperature, boolean SlipperyRoad) {
        if (temperature < 10 && SlipperyRoad) {
            System.out.println("You need Winter Tires");
        } else if (temperature < 4) {
            System.out.println("You need Winter Tires");
        } else
            System.out.println("You dont need WinterTires");
    }
}
