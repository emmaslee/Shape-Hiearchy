
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape{
   private double side1;
   private double side2;
   private double side3;
  
    public Triangle(String c, boolean fill, double s1, double s2, double s3) {
        super (c, fill);
        side1 = s1;
        side2 = s2;
        side3 = s3;
        
}

public double getSide1() {
    return side1;
}
public double getSide2() {
    return side2;
}
public double getSide3() {
    return side3;
}

public double calculateArea(double side1, double side2, double side3) {
   double area = (side1 + side2 + side3)/2;
   return area;
    }
    
public double calculatePerimeter(double side1, double side2, double side3) {
     return side1 + side2 + side3;   
    }
}
