import shapes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ShapeMixer shapeMixer = new ShapeMixer();


    shapeMixer.addShape(new Circle(4.2));
    shapeMixer.addShape(new Triangle(4.1,5.2));
    shapeMixer.addShape(new Rectangle(9.1,1.2));
    shapeMixer.addShape(new Triangle(8.1,0.11));
    shapeMixer.addShape(new Circle(1.5));
    shapeMixer.addShape(new Rectangle(3.1,6.2));
    shapeMixer.addShape(new Circle(8.4));
    shapeMixer.addShape(new Rectangle(14.1,0.54));
    shapeMixer.addShape(new Circle(9.1));
    shapeMixer.addShape(new Triangle(9.1,1.2));

    System.out.print("The top three shapes are : \n");
    List<Shape> topThree = shapeMixer.getTopThree();
    topThree.stream().forEach(shape -> {
        System.out.println(shape.getClass().getName() + " " + String.format("%.2f",shape.calculateArea()));
    });

}
