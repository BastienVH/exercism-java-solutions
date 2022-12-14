public class CarsAssemble {

    private static final int baseSpeed = 221;

    public double productionRatePerHour(int speed) {
        return speed * baseSpeed * successRate(speed);
    }
    
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

    private double successRate(int speed) {
        if (speed == 10) return .77;
        if (speed == 9) return .8;
        if (speed >= 5) return .9;
        if (speed >= 1) return 1;
        return 0;
    }
}
