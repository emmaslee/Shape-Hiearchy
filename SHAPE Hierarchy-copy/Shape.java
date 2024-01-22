
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape{   
    private String color;
    private boolean filled;
    
    
    public Shape(String c, boolean fill) { //String color
        String color = c;    // or this.color = color;
        boolean filled = fill;
    }
    
    public double calculateArea() {
    return 0;    
    }
    
    public double calculatePerimeter() {
    return 0;    
    }
    
    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
