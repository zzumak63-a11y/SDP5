public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to, double distanceKm) {
        double speed = 60;
        double time = distanceKm / speed;
        System.out.println("Car route: " + from + " -> " + to);
        System.out.println("Distance: " + distanceKm + " km, time: " + time + " h");
    }
}
