package shapes;

import java.util.*;

public class ShapeMixerQueueBased {

    public PriorityQueue<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(PriorityQueue<Shape> shapes) {
        this.shapes = shapes;
    }

    PriorityQueue<Shape> shapes = new PriorityQueue<Shape>(
            Comparator.comparingDouble(Shape::calculateArea).reversed()
    );


    public void addShape(Shape shape) {
        this.getShapes().add(shape);
    }

    public List<Shape> peekTopThree() {
        Shape first = this.getShapes().poll();
        Shape second = this.getShapes().poll();
        Shape third = this.getShapes().poll();

        List<Shape> topThree = new ArrayList<>();
        topThree.add(first);
        topThree.add(second);
        topThree.add(third);

        return topThree;
    }
}
