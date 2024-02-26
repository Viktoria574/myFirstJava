package lab6.ex1;

public class MovablePoint implements Movable{
    protected int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return "MovablePoint";
    }
    @Override
    public void moveUp(){
        y+=ySpeed;
    }
    @Override
    public void moveDown(){
        y-=ySpeed;
    }
    @Override
    public void moveLeft(){
        x-=xSpeed;
    }
    @Override
    public void moveRight(){
        x+=xSpeed;
    }
}
