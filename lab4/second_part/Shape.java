package lab4.second_part;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){}
    public Shape (String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void SetFilled(boolean filled){
        this.filled=filled;
    }
    public boolean GetFilled(){
        return filled;
    }
    public void SetColor(String color){
        this.color=color;
    }
    public String GetColor(){
        return color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
