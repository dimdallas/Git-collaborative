public class Point2D {
    private final double xCoordinate;
    private final double yCoordinate;

    public Point2D(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getX() {
        return xCoordinate;
    }

    public double getY() {
        return yCoordinate;
    }

    public boolean isIdentical(Point2D other){
        return other.getX() == xCoordinate || other.getY() == yCoordinate;
    }

    public double distance(Point2D other){
        double xDistance = Math.pow(xCoordinate - other.getX(), 2);
        double yDistance = Math.pow(yCoordinate - other.getY(), 2);

        return Math.sqrt(xDistance + yDistance);
    }
}
