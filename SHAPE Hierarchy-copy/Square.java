
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square extends Shape {
    private double side;
    
    public Square(String c, boolean fill, double side){
    super(c, fill);
    this.side = side;
}

//@Override
public double getSide(){
    return side;
}

 public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
