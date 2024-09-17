public class Main {
    public static void main(String[] args) {
        // Construct a Feeder object with the default constructor
        Feeder f = new Feeder();
        System.out.println(f); // This will print the object reference like Feeder@<hashcode>
        // Uncomment the next line, you'll get an error since currentFood is private
        // System.out.println(f.currentFood);

        // Use the accessor method to print the current food
        System.out.println("Current food in feeder f: " + f.getCurrentFood());

        // Create a new Feeder object with 500 units of food
        Feeder g = new Feeder(500);
        System.out.println("Current food in feeder g: " + g.getCurrentFood());

        // Simulate one day of feeding 12 birds
        g.simulateOneDay(12);

        // Print the remaining food after simulation
        System.out.println("Food remaining in feeder g after one day: " + g.getCurrentFood());
    }
}
