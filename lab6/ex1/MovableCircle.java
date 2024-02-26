package lab6.ex1;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }
    public String toString() {
        return "MovablePoint";
    }
}
