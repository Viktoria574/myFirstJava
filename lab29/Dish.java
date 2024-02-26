package lab29;

import java.io.Serializable;

public final class Dish implements Item, Serializable {
    private double price;
    private String name, description;
    public Dish(double price, String name, String description) throws IllegalArgumentException{
        if(price<0 || name==null)
            throw new IllegalArgumentException();
        this.price=price;
        this.name=name;
        this.description=description;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    public String toString() {
        return "\n\t\t\t Имя: " +this.name+" Цена: "+this.price;
    }
}
