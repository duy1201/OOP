public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public boolean isEqual(Point other) {
        return this.pointX == other.getPointX() && this.pointY == other.getPointY();
    }

    public double distance(Point other) {
        return Math.sqrt((this.pointX - other.getPointX()) * (this.pointX - other.getPointX())
                + (this.pointY - other.getPointY()) * (this.pointY - other.getPointY()));
    }
}
