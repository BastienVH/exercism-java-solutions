class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance;
    private int batteryCapacity = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (batteryCapacity == 0);
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryDrained()) return;
        distance += speed;
        batteryCapacity -= batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getMaxDistance() {
        return speed * batteryCapacity / batteryDrain;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return car.getMaxDistance() >= distance;
    }
}
