package lab4.second_part.ex10;

public class TestTransport {
    public static void main(String[] args) {
        Car car = new Car(80, 100, 10, 5, 10);
        Airplane plane = new Airplane(1550, 400, 1200, 150, 30);
        Ship ship = new Ship(500, 80, 800, 120, 25);
        Train train = new Train(250, 250, 700, 70, 35);
        car.Time();
        car.CoastPeople();
        car.CoastWeight();
        plane.Time();
        plane.CoastPeople();
        plane.CoastWeight();
        ship.Time();
        ship.CoastPeople();
        ship.CoastWeight();
        train.Time();
        train.CoastPeople();
        train.CoastWeight();
    }
}
