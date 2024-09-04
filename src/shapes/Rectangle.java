package shapes;
import shapes.Shape;

public class Rectangle implements Shape{
    
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double area() {
        return height*width;
    }

    @Override
    public double perimeter() {
        return 2*(width+height);
    }
}
