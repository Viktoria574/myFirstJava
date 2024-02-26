package lab4.atele;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женцина надела футболку");
    }
}
