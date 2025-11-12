public interface RentableVehicle {
    void rent();
    void returnVehicle();
}
public class Car implements RentableVehicle {
    @Override
    public void rent() {
        System.out.println("Car has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }
}
public class Bike implements RentableVehicle {
    @Override
    public void rent() {
        System.out.println("Bike has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike has been returned.");
    }
}
public class Bus implements RentableVehicle {
    @Override
    public void rent() {
        System.out.println("Bus has been rented.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bus has been returned.");
    }
}
public class RentalSystemDemo {
    public static void main(String[] args) {
        RentableVehicle[] fleet = {
            new Car(),
            new Bike(),
            new Bus()
        };

        for (RentableVehicle vehicle : fleet) {
            vehicle.rent();
        }

        for (RentableVehicle vehicle : fleet) {
            vehicle.returnVehicle();
        }
    }
}