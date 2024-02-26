package lab29;

import java.io.Serializable;

public final class Drink implements Item, Alcoholable, Serializable {
    private double price;
    private String name, description;
    private DrinkTypeEnum type;
    public Drink(double price, String name, String description, DrinkTypeEnum type) throws IllegalArgumentException{
        if(price<0 || name==null || description==null)
            throw new IllegalArgumentException();
        this.price=price;
        this.name=name;
        this.description=description;
        this.type=type;
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
    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return (type==DrinkTypeEnum.VODKA || type==DrinkTypeEnum.BRANDY || type==DrinkTypeEnum.TEQUILA);
    }
    @Override
    public double getAlcoholVol() {
        return (isAlcoholicDrink()?1:0)*40;
    }
    public String toString() {
        return "\n\t\t\t Имя: " +this.name+" Цена: "+this.price;
    }
}