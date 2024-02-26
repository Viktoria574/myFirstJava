package lab4.second_part.ex10;

public class Train extends Transport{
    public Train(float speed, float km, float coastKm, float coastWeight, float weight) {
        super(speed, km, coastKm, coastWeight, weight);
    }
    public void Time() {
        System.out.println("Время перевозки на поезде: "+km/speed);
    }
    public void CoastPeople() {
        System.out.println("Стоимость перевозки пассажира на поезде: "+km*coastKm);
    }
    public void CoastWeight() {
        System.out.println("Стоимость перевозки груза на поезде: "+km*coastKm+weight*coastWeight);
    }
}
