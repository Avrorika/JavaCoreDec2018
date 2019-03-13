package task06;

public class RunSubmarine {
    public static void main(String[] args) {
        Submarine shark = new Submarine("Shark", 5487,25,6000);
        shark.start();
        shark.accelerate(52);
        shark.stop();
        Submarine.Engine engine = shark.new Engine(65,"gas", "Logovaz");

    }
}
