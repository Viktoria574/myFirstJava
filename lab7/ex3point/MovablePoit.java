package lab7.ex3point;

public class MovablePoit implements Movable{
    int x, y, xSpeed, ySpeed;
    public MovablePoit(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "(" + this.x + "; " + this.y + "): speed = (" + this.xSpeed + "; " + this.ySpeed + ")";
    }
    @Override
    public void moveUp() {
        x += xSpeed;
    }
    @Override
    public void moveDown() {
        x -= xSpeed;
    }
    @Override
    public void moveLeft() {
        y -= ySpeed;
    }
    @Override
    public void moveRight() {
        y += ySpeed;
    }
    @Override
    public boolean SpeedTest(MovablePoit obj) {
        return Math.sqrt(this.xSpeed * this.xSpeed + this.ySpeed * this.ySpeed) == Math.sqrt(obj.xSpeed * obj.xSpeed + obj.ySpeed * obj.ySpeed);
    }
}
