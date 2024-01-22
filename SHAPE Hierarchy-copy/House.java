
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Shape{
     private Square base;
     private Triangle roof;  //hasa relaionships
    
     public House(String color, boolean filled, double baseSide, double roofSide) {
        super(color, filled);
        this.base = new Square(color, filled, baseSide);
        this.roof = new Triangle(color, filled, roofSide, roofSide, roofSide);
    }
    public double calculateTotalArea() {
        return base.calculateArea() + roof.calculateArea();
    }

    public double calculateTotalPerimeter() {
        return base.calculatePerimeter() + roof.calculatePerimeter();
    }

    // public void displayInfo() {
    //    System.out.println("House Information:");
    //    System.out.println("Base:");
    //    base.displayInfo();
    //    System.out.println("Roof:");
    //  roof.displayInfo();
    }


