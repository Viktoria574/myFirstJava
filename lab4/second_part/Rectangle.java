package lab4.second_part;

public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double GetWidth(){
        return width;
    }
    public void SetR(double width){
        this.width=width;
    }
    public double GetLength(){
        return length;
    }
    public void SetLength(double length){
        this.length=length;;
    }
    @Override
    public double getArea(){
        return length*width;
    }
    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
    @Override
    public String toString(){
        return "Rectangle";
    }
}
