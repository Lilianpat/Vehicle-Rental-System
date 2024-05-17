// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Black", "Toyota", 2022, "gasoline", 23245, 4, 4);
        Bike bike = new Bike("Red", "Mitsubishi", 2018, "gasoline", 12345, 2);
        Tricycle tricycle = new Tricycle("Red", "Mitibushi", 2018, "gasoline", 12345, 2);


        car.rent();
        bike.rent();
        tricycle.rent();
        car.returnVehicle();
        bike.returnVehicle();


        System.out.println("Car availability: " + car.isAvailable());
        System.out.println("Bike availability: " + bike.isAvailable());
        System.out.println("Tricycle availability: " + tricycle.isAvailable());
    }
}