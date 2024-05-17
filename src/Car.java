public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String color, String brand, int year, String fuelType, int vehicleIdentificationNumber, int numberOfTyres, int numberOfDoors){
     super(color, brand, year, fuelType, vehicleIdentificationNumber, numberOfTyres);
     this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
