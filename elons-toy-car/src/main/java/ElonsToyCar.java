public class ElonsToyCar {

    private int distance;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        return (battery == 0) ? "Battery empty" : String.format("Battery at %d%%", this.battery);
    }

    public void drive() {
        if (this.battery > 0 ) {
            this.distance += 20;
            this.battery--;
        }
    }
}
