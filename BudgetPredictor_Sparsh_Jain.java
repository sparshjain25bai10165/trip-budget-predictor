import java.util.Scanner;

public class BudgetPredictor {

    // Calculates the estimated transport cost for a round trip.
    static double calculateTransport(double distance) {
        double transportRate = 12.0;
        return distance * 2 * transportRate;
    }

    // Calculates the total food cost for the trip.
    static double calculateFood(int days, int persons, double dailyFoodCost) {
        return days * persons * dailyFoodCost;
    }

    // Calculates the total hotel cost for the trip.
    static double calculateHotel(int days, int persons, double dailyHotelCost) {
        return days * persons * dailyHotelCost;
    }

    // Calculates the total cost of activities and sightseeing.
    static double calculateActivities(int days, int persons, double dailyActivityCost) {
        return days * persons * dailyActivityCost;
    }

    // Gives a simple category based on the estimated cost per person.
    static String getBudgetCategory(double costPerPerson) {
        if (costPerPerson <= 5000) {
            return "LOW / BUDGET TRIP";
        } else if (costPerPerson <= 10000) {
            return "MODERATE TRIP";
        } else {
            return "PREMIUM TRIP";
        }
    }

    static void runBudgetPredictor(Scanner scanner) {

        System.out.println("\n======================================");
        System.out.println("        TRIP BUDGET PREDICTOR");
        System.out.println("======================================");

        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();

        int persons;
        int days;
        double distance;
        double dailyFoodCost;
        double dailyHotelCost;
        double dailyActivityCost;
        double miscellaneous;

        try {
            System.out.print("Enter number of travellers: ");
            persons = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter trip duration in days: ");
            days = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter one-way distance in km: ");
            distance = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter daily food cost per person (Rs): ");
            dailyFoodCost = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter daily hotel cost per person (Rs): ");
            dailyHotelCost = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter daily activities cost per person (Rs): ");
            dailyActivityCost = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter miscellaneous expenses (Rs): ");
            miscellaneous = Double.parseDouble(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numbers where required.");
            return;
        }

        if (persons <= 0 || days <= 0 || distance < 0 ||
                dailyFoodCost < 0 || dailyHotelCost < 0 ||
                dailyActivityCost < 0 || miscellaneous < 0) {
            System.out.println("Please enter valid positive values.");
            return;
        }

        double transport = calculateTransport(distance);
        double food = calculateFood(days, persons, dailyFoodCost);
        double hotel = calculateHotel(days, persons, dailyHotelCost);
        double activities = calculateActivities(days, persons, dailyActivityCost);

        double totalBudget = transport + food + hotel + activities + miscellaneous;
        double costPerPerson = totalBudget / persons;

        String category = getBudgetCategory(costPerPerson);

        System.out.println("\n----------- BUDGET SUMMARY -----------");
        System.out.println("Destination        : " + destination);
        System.out.printf("Transport Cost     : Rs %.2f%n", transport);
        System.out.printf("Food Cost          : Rs %.2f%n", food);
        System.out.printf("Hotel Cost         : Rs %.2f%n", hotel);
        System.out.printf("Activities Cost    : Rs %.2f%n", activities);
        System.out.printf("Miscellaneous      : Rs %.2f%n", miscellaneous);
        System.out.println("--------------------------------------");
        System.out.printf("Total Trip Budget  : Rs %.2f%n", totalBudget);
        System.out.printf("Cost Per Person    : Rs %.2f%n", costPerPerson);
        System.out.println("Trip Category      : " + category);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        runBudgetPredictor(scanner);

        scanner.close();
    }
}

/*
 * Project Information
 *
 * Student Name : Sparsh Jain
 * Course       : Programming in Java
 * Topic        : Trip Budget Predictor
 * Project Type : Java Console Application
 */
