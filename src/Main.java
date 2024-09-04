import shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape;
        String reshaped;

        while (true) {
            System.out.print("Choose a shape (Circle or Rectangle) or type 'exit' to quit: ");
            shape = sc.nextLine().trim().toLowerCase();

            if (shape.equals("exit")) {
                break;
            } else if (shape.equals("circle")) {
                handleCircle(sc);
            } else if (shape.equals("rectangle")) {
                handleRectangle(sc);
            } else {
                System.out.println("Invalid shape. Please enter 'Circle' or 'Rectangle'.");
            }
        }

        System.out.println("See you! Bye");
    }

    private static void handleCircle(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter the radius of the circle: ");
                int radius = Integer.parseInt(sc.nextLine().trim());
                Circle cir = new Circle(radius);
                System.out.println("Shape: Circle");
                System.out.println("Area: " + cir.area());
                System.out.println("Perimeter: " + cir.perimeter());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number for the radius.");
            }
        }


    }

    private static void handleRectangle(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter the width of the rectangle: ");
                int width = Integer.parseInt(sc.nextLine().trim());
                System.out.print("Enter the length of the rectangle: ");
                int length = Integer.parseInt(sc.nextLine().trim());
                Rectangle rec = new Rectangle(width, length);
                System.out.println("Shape: Rectangle");
                System.out.println("Area: " + rec.area());
                System.out.println("Perimeter: " + rec.perimeter());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid numbers for width and length.");
            }
        }


    }


}
