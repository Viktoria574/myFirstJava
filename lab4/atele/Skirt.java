package lab4.atele;

public class Skirt extends Clothes implements WomenClothing{
    public Skirt(Sizes size, float price, String color) {
        super(size, price, color);
    }
    @Override
    public void dressWomen() {
        System.out.println("Девушка надела юбку");
    }
}
