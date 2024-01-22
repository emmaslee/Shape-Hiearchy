
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape {
    private double radius;
  
    public Circle(String c, boolean fill, double r) {
        super (c, fill);
        radius = r;
    } 
    
    public double getRadius() {
        return radius;
    }
    
   // @Override
    public double calculateArea(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }
    
    public double calculatePerimeter(double radius) {
        return Math.PI*(2*radius);
    }
    
}
