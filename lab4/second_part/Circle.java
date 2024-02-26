package lab4.second_part;

public class Circle extends Shape{
    protected double radius;
    public Circle() {}
    public Circle(double radius) {
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }
    public double GetR(){
        return radius;
    }
    public void SetR(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    @Override
    public String toString(){
        return "Circle";
    }
}
