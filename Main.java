public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        navigator.planRoute("Home", "University", 12);

        System.out.println();
        navigator.setStrategy(new WalkStrategy());
        navigator.planRoute("Home", "University", 12);

        System.out.println();
        navigator.setStrategy(new CycleStrategy());
        navigator.planRoute("Home", "University", 12);

        System.out.println();
        navigator.setStrategy(new BusStrategy());
        navigator.planRoute("Home", "University", 12);
    }
}

