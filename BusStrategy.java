public class BusStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to, double distanceKm) {
        double speed = 30;
        double time = distanceKm / speed;
        System.out.println("Bus route: " + from + " -> " + to);
        System.out.println("Distance: " + distanceKm + " km, time: " + time + " h");
    }
}

