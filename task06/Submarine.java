package task06;

/**
 * Разработайте класс АтомнаяЛодка, создайте внутренний класс – ДвигательДляАтомнойЛодки. Создайте объект АтомнаяЛодка и “запустите его в плавание”.
 */

public class Submarine {

    private String name;
    private double price;
    private double capacity;
    private double tonnage;
    private double currentSpeed;
    private boolean isRunning;

       public Submarine(String name, double price, double capacity, double tonnage) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
        this.tonnage = tonnage;
        Engine engine = new Engine(25, "Diesel", "BMW");
    }

    public void start() {
        isRunning = true;
        currentSpeed = 10;
        System.out.println("It is running.");

    }

    public void stop() {
        isRunning = false;
        currentSpeed = 0;
        System.out.println("It has stopped.");
    }

    public void accelerate(int kmPh) {
        currentSpeed += currentSpeed;
        System.out.println("Current speed is " + currentSpeed + " km per hour.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public class Engine {

        double engineCapacity;
        String engineType;
        String EngineBrand;

        public Engine(double engineCapacity, String engineType, String engineBrand) {
            this.engineCapacity = engineCapacity;
            this.engineType = engineType;
            EngineBrand = engineBrand;
        }

        public double getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
        }

        public String getEngineType() {
            return engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        public String getEngineBrand() {
            return EngineBrand;
        }

        public void setEngineBrand(String engineBrand) {
            EngineBrand = engineBrand;
        }
    }
}
