package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        boolean running = true;

        while (running) {
            try {
                System.out.println("\n=== Vehicle Management System ===");
                System.out.println("1. Add vehicle");
                System.out.println("2. Display all vehicles");
                System.out.println("3. Edit vehicle");
                System.out.println("4. Search vehicle");
                System.out.println("5. Get total tax");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); 

                switch (choice) {
                    case 1:
                        try {
                            System.out.println("\n=== Add New Vehicle ===");
                            System.out.print("Enter the vehicle id: ");
                            String id = sc.nextLine();

                            System.out.print("Enter the vehicle name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter the vehicle production year: ");
                            int productionYear = sc.nextInt();

                            System.out.print("Enter the vehicle price: ");
                            double price = sc.nextDouble();
                            sc.nextLine(); // Clear buffer

                            System.out.print("Enter the vehicle brand: ");
                            String brand = sc.nextLine();

                            System.out.print("Enter the vehicle seat number: ");
                            int seatNumber = sc.nextInt();

                            System.out.print("Enter the vehicle extra fee: ");
                            double extraFee = sc.nextDouble();
                            sc.nextLine(); // Clear buffer

                            Car car = new Car(brand, seatNumber, extraFee, id, name, productionYear, price);
                            vehicleManager.addVehicle(car);
                        } catch (Exception e) {
                            System.out.println("Error adding vehicle: " + e.getMessage());
                            sc.nextLine(); // Clear invalid input
                        }
                        break;

                    case 2:
                        try {
                            vehicleManager.displayAllVehicles();
                        } catch (Exception e) {
                            System.out.println("Error displaying vehicles: " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            System.out.println("\n=== Edit Vehicle ===");
                            System.out.print("Enter the vehicle id to edit: ");
                            String id = sc.nextLine();

                            System.out.print("Enter the vehicle name: ");
                            String name = sc.nextLine();

                            System.out.print("Enter the vehicle production year: ");
                            int productionYear = sc.nextInt();

                            System.out.print("Enter the vehicle price: ");
                            double price = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("Enter the vehicle brand: ");
                            String brand = sc.nextLine();

                            System.out.print("Enter the vehicle seat number: ");
                            int seatNumber = sc.nextInt();

                            System.out.print("Enter the vehicle extra fee: ");
                            double extraFee = sc.nextDouble();
                            sc.nextLine(); // Clear buffer

                            Car car = new Car(brand, seatNumber, extraFee, id, name, productionYear, price);
                            vehicleManager.editVehicle(car);
                        } catch (Exception e) {
                            System.out.println("Error editing vehicle: " + e.getMessage());
                            sc.nextLine(); // Clear invalid input
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("\nEnter the vehicle name to search: ");
                            String name = sc.nextLine();
                            vehicleManager.searchVehicle(name);
                        } catch (Exception e) {
                            System.out.println("Error searching vehicle: " + e.getMessage());
                        }
                        break;

                    case 5:
                        try {
                            vehicleManager.getTotalTax();
                        } catch (Exception e) {
                            System.out.println("Error calculating total tax: " + e.getMessage());
                        }
                        break;

                    case 6:
                        System.out.println("Exiting... Goodbye!");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter 1-6.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}
