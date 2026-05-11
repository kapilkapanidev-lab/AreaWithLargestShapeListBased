# AreaWithLargestShape

A Java project that calculates and identifies the shapes with the largest areas from a collection of different geometric shapes.

## Project Structure

- `src/shapes/`: Contains the shape classes and logic for processing them.
  - `Shape.java`: Base interface or abstract class for all shapes.
  - `Circle.java`, `Rectangle.java`, `Triangle.java`: Concrete implementations of geometric shapes.
  - `ShapeMixer.java`: Logic to add shapes and retrieve the top three largest shapes based on area.
  - `ShapeMixerQueueBased.java`: Alternative implementation using a queue-based approach.
- `src/Main.java`: Entry point to demonstrate shape creation and finding the top three shapes.

## How to Run

1. Open the project in an IDE like IntelliJ IDEA.
2. Run the `Main.java` file.
3. The program will output the top three shapes along with their calculated areas.

## Example Output
```text
The top three shapes are:
shapes.Circle 260.16
shapes.Circle 221.67
shapes.Circle 55.42
```
