import java.util.ArrayList;

public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car("Clio", 10000);
        Car peugeot = new Car("Peugeot", 20000);
        Car citroen = new Car("Citroen", 30000);
        Boat titanic = new Boat("Titanic", 50000);
        Boat anotherBoat = new Boat("Another Boat", 80000);

        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(clio);
        vehicles.add(peugeot);
        vehicles.add(citroen);
        vehicles.add(titanic);
        vehicles.add(anotherBoat);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(clio);
        cars.add(peugeot);
        cars.add(citroen);
        ArrayList<Boat> boats = new ArrayList<>();
        boats.add(titanic);
        boats.add(anotherBoat);

        System.out.println("Vehicles list :");
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getBrand());
        }

        
        System.out.println("Cars list :");
        for (Car car : cars) {
            System.out.println("- " + car.getBrand());
        }
        
        System.out.println("Boats list :");
        for (Boat boat : boats) {
            System.out.println("- " + boat.getBrand());
        }
    }
}
