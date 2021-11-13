public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * this is constructor.
     *
     * @param p1 Point
     * @param p2 Point
     * @param p3 Point
     * @throws RuntimeException exception
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);

        if (p1.isEqual(p2) || p1.isEqual(p3) || p2.isEqual(p3)
                || d1 + d2 == d3 || d1 + d3 == d2 || d2 + d3 == d1) {
            throw new RuntimeException();
        }

        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double d1 = p1.distance(p2);
        double d2 = p2.distance(p3);
        double d3 = p3.distance(p1);
        double p = (d1 + d2 + d3) / 2;
        return Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
    }

    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX()) + ","
                + String.format("%.2f", p1.getPointY()) + "),"
                + "(" + String.format("%.2f", p2.getPointX()) + ","
                + String.format("%.2f", p2.getPointY()) + "),"
                + "(" + String.format("%.2f", p3.getPointX()) + ","
                + String.format("%.2f", p3.getPointY()) + ")]";
    }
}
