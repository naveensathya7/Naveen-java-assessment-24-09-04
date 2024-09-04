package shapes;
import shapes.Shape;
import java.math.*;

public class Circle implements Shape{
    public int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow((double) radius,2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
