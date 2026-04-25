package shapes;

public class Circle implements Shape {
    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    private Double radius;

    @Override
    public Double calculateArea() {
        return Math.PI * this.getRadius()   * this.getRadius();
    }
}
