public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void planRoute(String from, String to, double distanceKm) {
        strategy.buildRoute(from, to, distanceKm);
    }
}

