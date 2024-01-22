
/**
 * Write a description of class Pentagon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pentagon extends Shape
{
    private int numSides;
    private double sideLength;
    private double apothemLength;
    public Pentagon(String c, boolean fill, double s, int n, double a){
    super(c, fill);
    this.sideLength = s;
    this.numSides = n;
    this.apothemLength = a;
}    

public double calculateArea(){
    return (0.25) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideLength, 2);
}
    public double calculatePerimeter(double sideLength, double numSides) {
     return numSides*sideLength;  
    }

    
}
