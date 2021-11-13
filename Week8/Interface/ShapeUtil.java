import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * this is printInfo.
     *
     * @param shapes List
     * @return list of shapes
     */
    public String printInfo(List<GeometricObject> shapes) {
        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();

        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circles.add((Circle) shape);
            } else {
                triangles.add((Triangle) shape);
            }
        }

        String ans = "Circle:" + "\n";

        for (Circle circle : circles) {
            ans += circle.getInfo() + "\n";
        }

        ans += "Triangle:" + "\n";

        for (Triangle triangle : triangles) {
            ans += triangle.getInfo() + "\n";
        }

        return ans;
    }
}
