package shapes;

public class Rectangle implements Shape {
    private Double length;
    private Double breadth;

    public Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Double getBreadth() {
        return breadth;
    }

    public void setBreadth(Double breadth) {
        this.breadth = breadth;
    }

    @Override
    public Double calculateArea() {
        return this.getLength() * this.getBreadth();
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
