class Darts {
    int score(double xOfDart, double yOfDart) {
        if (distanceToCenter(xOfDart, yOfDart) <= 1)
            return 10;
        if (distanceToCenter(xOfDart, yOfDart) <= 5)
            return 5;
        if (distanceToCenter(xOfDart, yOfDart) <= 10)
            return 1;
        return 0;
    }

    private double distanceToCenter(double xOfDart, double yOfDart) {
        return Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));
    }
}
