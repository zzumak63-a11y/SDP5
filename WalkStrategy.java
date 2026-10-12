public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String from, String to, double distanceKm) {
        double speed = 5;
        double time = distanceKm / speed;
        System.out.println("Walk route: " + from + " -> " + to);
        System.out.println("Distance: " + distanceKm + " km, time: " + time + " h");
    }
}

