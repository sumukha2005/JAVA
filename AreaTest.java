
interface Area {
    void findArea(); 
    
   
    default void displayMessage(String message) {
        System.out.println(message);
    }
}


class Rectangle implements Area {
    private double length;
    private double width;

   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    @Override
    public void findArea() {
        double area = length * width;
        displayMessage("Area of Rectangle: " + area);
    }
}


class Triangle implements Area {
    private double base;
    private double height;

    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

  
    @Override
    public void findArea() {
        double area = 0.5 * base * height;
        displayMessage("Area of Triangle: " + area);
    }
}

public class AreaTest {
    public static void main(String[] args) {
        
        Area myRectangle = new Rectangle(5, 7);  
        Area myTriangle = new Triangle(4, 6);    
        
       
        myRectangle.findArea();
        myTriangle.findArea();
    }
}
