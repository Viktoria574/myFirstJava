package lab4.atele;

public class Pants extends Clothes implements WomenClothing, MenClothing{
    public Pants(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женцина надела штаны");
    }
}
