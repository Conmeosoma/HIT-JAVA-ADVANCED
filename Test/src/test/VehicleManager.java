package test;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManager implements IVehicleManager {
  ArrayList<Car> cars = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  
  @Override
  public void addVehicle(Car car) {
    cars.add(car);
    System.out.println("Vehicle added successfully!");
  }
  
  @Override
  public void editVehicle(Car car) {
    boolean found = false;
    for (int i = 0; i < cars.size(); i++) {
      if (cars.get(i).getId().equals(car.getId())) {
        cars.set(i, car);
        System.out.println("Vehicle updated successfully!");
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println("Vehicle with ID " + car.getId() + " not found");
    }
  }
  
  @Override
  public void searchVehicle(String name) {
    boolean found = false;
    for (Car car : cars) {
      if (car.getName().equalsIgnoreCase(name)) {
        System.out.println(car);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Vehicle not found");
    }
  }
  
  @Override
  public void getTotalTax() {
    if (cars.isEmpty()) {
      System.out.println("No vehicles to calculate tax");
      return;
    }
    double totalTax = 0;
    for (Car car : cars) {
      totalTax += car.getTax();
    }
    System.out.println("Total tax: " + totalTax);
  }
  
  public void displayAllVehicles() {
    if (cars.isEmpty()) {
      System.out.println("No vehicles found");
    } else {
      System.out.println("\n=== All Vehicles ===");
      for (Car car : cars) {
        System.out.println(car);
      }
    }
  }
}

