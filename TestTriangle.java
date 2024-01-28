import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter color: ");
        String color = scanner.next();

        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Triangle Information:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
