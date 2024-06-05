import  java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in2 = new Scanner(System.in);
        double tankGallons = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double costPer100g;
        double howFarFull;
        boolean tankGallonsBoolean = false;
        boolean fuelEfficiencyBoolean = false;
        boolean gasPriceBoolean = false;
        do {
            System.out.println("Enter the amount of gas in gallons in your tank.");
            if (in2.hasNextDouble()) {
                tankGallons = in2.nextDouble();
                in2.nextLine();
                tankGallonsBoolean = true;
            }
            else {
                System.out.println("Invalid input!");
                in2.nextLine();
            }
        } while (!tankGallonsBoolean);
        do {
            System.out.println("Enter your fuel efficiency in miles per gallon.");
            if (in2.hasNextDouble()) {
                fuelEfficiency = in2.nextDouble();
                in2.nextLine();
                fuelEfficiencyBoolean = true;
            }
            else {
                System.out.println("Invalid input!");
                in2.nextLine();
            }
        } while (!fuelEfficiencyBoolean);
        do {
            System.out.println("Enter the gas price.");
            if (in2.hasNextDouble()) {
                gasPrice = in2.nextDouble();
                in2.nextLine();
                gasPriceBoolean = true;
            }
            else {
                System.out.println("Invalid input!");
                in2.nextLine();
            }
        } while (!gasPriceBoolean);
        costPer100g = gasPrice * (100 / fuelEfficiency);
        System.out.println("Your cost for a 100 mile trip will be " + costPer100g);
        howFarFull = tankGallons * fuelEfficiency;
        System.out.println("Your distance covered with a full tank of gas is " + howFarFull);
    }
}
