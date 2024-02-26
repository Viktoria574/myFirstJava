package lab4.second_part;

public class Square extends Rectangle{
    protected double side;
    public Square() {}
    public Square(double side) {
        this.side=side;
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side=side;
    }
    public double GetSide(){
        return side;
    }
    public void SetSide(double width){
        this.side=side;
    }
    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }
    @Override
    public String toString(){
        return "Square";
    }
}
