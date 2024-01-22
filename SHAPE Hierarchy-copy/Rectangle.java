
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
    
   private double length;
   private double width;
  
    public Rectangle(String c, boolean fill, double l, double w) {
        super (c, fill);
        length = l;
        width = w;
    } 
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double calculateArea(double length, double width) {
        double area = length*width;
        return area;
        
    }
    
    public double calculatePerimeter(double length, double width) {
        double perimeter = (length*width)*2;
        return perimeter;
    }
}
