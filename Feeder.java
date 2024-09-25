public class Feeder {
    private int currentFood;

    // Default constructor
    public Feeder() {
        currentFood = 0; // Set initial food to 0 by default
    }

    // Constructor with initial food value
    public Feeder(int c) {
        currentFood = c; // Set initial food to the value passed in
    }

    // Accessor method to get current food
    public int getCurrentFood() {
        return currentFood;
    }

    // Method to simulate one day of feeding
    public void simulateOneDay(int numBirds) {
        if (numBirds <= 0) {
            throw new IllegalArgumentException("Number of birds must be positive");
        }

        // Generate random amount of food eaten by each bird, between 10 and 50
        int foodPerBird = (int) (Math.random() * 41) + 10; // Random number between 10 and 50
        int totalFoodNeeded = numBirds * foodPerBird;

        // Deduct the food needed, ensure food doesn't go below 0
        if (currentFood >= totalFoodNeeded) {
            currentFood -= totalFoodNeeded;
        } else {
            currentFood = 0;
        }

        System.out.println("Birds ate " + totalFoodNeeded + " units of food today.");
    }
    public int simulateManyDays(int numBirds, int numDays) {
        int daysWithFood = 0;
        
        for (int i = 0; i < numDays; i++) {
            if (currentFood > 0) {
                daysWithFood++;
            }
            simulateOneDay(numBirds); // Simulate one day of feeding
        }
        
        return daysWithFood;
    }

}
