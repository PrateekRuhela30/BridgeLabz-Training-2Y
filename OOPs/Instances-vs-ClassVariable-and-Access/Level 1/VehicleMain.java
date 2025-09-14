package com.icvm;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(300.0);

        Vehicle v1 = new Vehicle("Prateek", "Car");
        Vehicle v2 = new Vehicle("Rahul", "Motorcycle");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(350.0);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
