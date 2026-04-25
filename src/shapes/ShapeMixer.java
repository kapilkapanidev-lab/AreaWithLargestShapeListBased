package shapes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeMixer {
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getTopThree() {
        List<Shape> topThree = this.shapes.stream().sorted(Comparator.comparingDouble(Shape::calculateArea).reversed()).limit(3).collect(Collectors.toList());
        return topThree;
    }
}
