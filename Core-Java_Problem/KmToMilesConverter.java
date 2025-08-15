public class KmToMilesConverter {
    public static void main(String[] args) {
        double distanceInKm = 10.8;
        double milesPerKm = 0.621371; // Standard conversion factor
        double distanceInMiles = distanceInKm * milesPerKm;
        System.out.println("The distance " + distanceInKm + " km in miles is " + distanceInMiles);
    }
}
