import java.io.Console;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled;

    private int numberofVictories;

    public void drive() {
        distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberofVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar car) {
        if (this.getNumberOfVictories() > car.getNumberOfVictories()) return 1;
        return -1;
    }
}
