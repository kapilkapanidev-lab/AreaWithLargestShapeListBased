package shapes;

public class Triangle implements Shape{
    @Override
    public Double calculateArea() {
        return 0.5 * this.getBase() * this.getHeight();
    }

    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
