package lab4.atele;

public class Tie extends Clothes implements MenClothing{
    public Tie(Sizes size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Мужчина надел галстук");
    }
}
