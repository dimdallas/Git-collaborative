public class Point3D {
    private final double xCoordinate;
    private final double yCoordinate;
    private final double zCoordinate;

    public Point3D(double xCoordinate, double yCoordinate, double zCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
    }

    public double getX() {
        return xCoordinate;
    }

    public double getY() {
        return yCoordinate;
    }

    public double getZ() {
        return zCoordinate;
    }

    public boolean isIdentical(Point3D other){
        return other.getX() == xCoordinate && other.getY() == yCoordinate && other.getZ() == zCoordinate;
    }

    // computes Euclidean distance between point A and point B in a cartesian coordinate system
    //public double distance(Point2D other){
    //    double xDistance = Math.pow(xCoordinate - other.getX(), 2);
    //    double yDistance = Math.pow(yCoordinate - other.getY(), 2);

    //    return Math.sqrt(xDistance + yDistance);
    //}
}

