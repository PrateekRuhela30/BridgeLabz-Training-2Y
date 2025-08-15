public class EarthVolume {
    public static void main(String[] args) {
        double earthRadiusKm = 6378.0;
        double milesPerKm = 0.621371;
        double earthRadiusMiles = earthRadiusKm * milesPerKm;
        double volumeCubicKm = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);
        double volumeCubicMiles = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeCubicKm + " and cubic miles is " + volumeCubicMiles);
    }
}
