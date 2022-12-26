class Triangle {
    private final double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (!isValidTriangle(side1, side2, side3)) throw new TriangleException();
    }

    boolean isEquilateral() {
        return (side1 == side2 && side2 == side3);
    }

    boolean isIsosceles() {
        return (side1 == side2 || side2 == side3 || side3 == side1);
    }

    boolean isScalene() {
        return side1 != side2 && side2 != side3 && side3 != side1;
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        // check if all sides are longer than 0
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) return false;
        // check if sum of any 2 sides are larger than remaining side
        if ((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side2 + side3) <= side1) return false;
        return true;
    }

}
