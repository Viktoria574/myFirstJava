package lab4.second_part.ex10;

public class Ship extends Transport{
    public Ship(float speed, float km, float coastKm, float coastWeight, float weight) {
        super(speed, km, coastKm, coastWeight, weight);
    }
    public void Time() {
        System.out.println("Время перевозки на корабле: "+km/speed);
    }
    public void CoastPeople() {
        System.out.println("Стоимость перевозки пассажира на корабле: "+km*coastKm);
    }
    public void CoastWeight() {
        System.out.println("Стоимость перевозки груза на корабле: "+km*coastKm+weight*coastWeight);
    }
}
