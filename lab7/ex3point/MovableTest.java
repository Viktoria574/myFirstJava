package lab7.ex3point;

public class MovableTest {
    public static void main(String[] args){
        MovablePoit point1 = new MovablePoit(1, 2, 3, 4);
        System.out.println("MovablePoint1: " + point1.toString());
        MovablePoit point2 = new MovablePoit(5, 6, 4, 3);
        System.out.println("MovablePoint2: " + point2.toString());
        System.out.println(point1.SpeedTest(point2)? "Скорости точек равны" : "Скорости точек не равны");
    }
}
