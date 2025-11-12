interface VehicleDashboard {
    void displaySpeed();

    default void displayBatteryPercentage() {
        System.out.println(" Battery status not available for non-electric vehicles.");
    }
}

class PetrolCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println(" Speed: 80 km/h");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() {
        System.out.println(" Speed: 60 km/h");
    }

    public void displayBatteryPercentage() {
        System.out.println(" Battery: 85%");
    }
}

public class DashboardApp {
    public static void main(String[] args) {
        VehicleDashboard petrol = new PetrolCar();
        VehicleDashboard electric = new ElectricCar();

        petrol.displaySpeed();
        petrol.displayBatteryPercentage();

        electric.displaySpeed();
        electric.displayBatteryPercentage();
    }
}