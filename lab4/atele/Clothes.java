package lab4.atele;

public abstract class Clothes {
    Sizes size;
    float coast;
    String color;
    public Clothes(Sizes size, float coast, String color){
        this.size=size;
        this.coast=coast;
        this.color=color;
    }
}
