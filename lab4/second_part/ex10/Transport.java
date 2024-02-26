package lab4.second_part.ex10;

public abstract class Transport {
    protected float speed, km, coastKm, coastWeight, weight;
    public Transport(float speed, float km, float coastKm, float coastWeight, float weight){
        this.speed=speed;
        this.km=km;
        this.coastKm=coastKm;
        this.coastWeight=coastWeight;
        this.weight=weight;
    }
    public abstract void Time();
    public abstract void CoastPeople();
    public abstract void CoastWeight();
}
