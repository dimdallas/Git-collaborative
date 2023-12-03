public class Circle2D {
    // Uses implementation of Dimitri's Point2D.java
    private final Point2D center;
    private final double radius;

    public Circle2D(Point2D center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point2D getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    // Compares Euclidean distance of center A and center B with sum of radius A and radius B
    public boolean overlaps(Circle2D other){
        // Changed "less than or equal" operator to "less than" to include single point intersection (tangent circles)
        return center.distance(other.getCenter()) < radius + other.getRadius();
    }
}
