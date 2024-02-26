package lab4.second_part.ex10;

public class Car extends Transport{
    public Car(float speed, float km, float coastKm, float coastWeight, float weight) {
        super(speed, km, coastKm, coastWeight, weight);
    }
    public void Time() {
        System.out.println("Время перевозки на автомобиле: "+km/speed);
    }
    public void CoastPeople() {
        System.out.println("Стоимость перевозки пассажира на автомобиле: "+km*coastKm);
    }
    public void CoastWeight() {
        System.out.println("Стоимость перевозки груза на автомобиле: "+km*coastKm+weight*coastWeight);
    }
}
