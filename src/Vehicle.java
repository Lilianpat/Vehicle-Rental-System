public class Vehicle {
    //attributes of a vehicle
    public String color;
    public String brand;
    public int year;
    public String fuelType;
    public int vehicleIdentificationNumber;
    public int numberOfTyres;
    public boolean available;

    public Vehicle(String color, String brand, int year, String fuelType, int vehicleIdentificationNumber, int numberOfTyres) {
        this.color = color;
        this.brand = brand;
        this.year = year;
        this.fuelType = fuelType;
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.numberOfTyres = numberOfTyres;
        this.available = true;
    }

    //method for renting vehicle
    public void rent() {
        if (available) {
            available = false;
            System.out.println("Vehicle rented: " + color + " " + brand + year + " with Vehicle Identification Number: " + vehicleIdentificationNumber);
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    //method for returning vehicle
    public void returnVehicle() {
        if (!available) {
            available = true;
            System.out.println("Vehicle returned: " + color + " " + brand + year + " with Vehicle Identification Number: " + vehicleIdentificationNumber);
        } else {
            System.out.println("Vehicle is not currently rented.");
        }
    }

    //tracking vehicle availability
    public boolean isAvailable() {
        return available;
    }

}

