package lab4.second_part.ex10;

public class Airplane extends Transport{
    public Airplane(float speed, float km, float coastKm, float coastWeight, float weight) {
        super(speed, km, coastKm, coastWeight, weight);
    }
    public void Time() {
        System.out.println("Время перевозки на самолете: "+km/speed);
    }
    public void CoastPeople() {
        System.out.println("Стоимость перевозки пассажира на самолете: "+km*coastKm);
    }
    public void CoastWeight() {
        System.out.println("Стоимость перевозки груза на самолете: "+km*coastKm+weight*coastWeight);
    }
}
