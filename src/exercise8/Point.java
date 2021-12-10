package exercise8;

public class Point {
    // Define attributes
    double x;
    double y;

    public Point() {
        // Initialize attributes to 0
        x = 0;
        y = 0;
    }

    public Point(double x, double y) {
        // Initialize attributes by coping x and y parameters
        this.x = x;
        this.y = y;
    }

    public Point(Point otherPoint) {
        // Initialize attributes by coping attributes of otherPoint
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public void initialize() {
        // Change attributes through console
        x = Utils.INPUT.nextDouble();
        y = Utils.INPUT.nextDouble();
    }

    public void translate(double xDelta, double yDelta) {
        // Change attributes by adding xDelta and yDelta
        x = x + xDelta;
        y = y + yDelta;
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        // Create new point which is translated relative to this point
        double newX = x + xDelta;
        double newY = y + yDelta;
        Point p = new Point (newX, newY);
        return p;
    }

    public boolean equals(Point otherPoint) {
        // Compare attributes of this point to attributes of otherPoint for equal
        boolean xEqual = Utils.equals(x, otherPoint.x);
        boolean yEqual = Utils.equals(y, otherPoint.y);
        return xEqual && yEqual;
    }

    public String toString() {
        // Represent attributes as string

        return "(" + x + ", " + y + ")";
    }
}
