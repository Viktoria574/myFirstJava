package lab4.atele;

public class Atelier {
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes clothing : clothes) {
            if (clothing instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) clothing;
                womenClothing.dressWomen();
                System.out.println("Size = " +  clothing.size.toString() + " (" + clothing.size.getDiscrition()+"); Price = " + clothing.coast + "; Color = " + clothing.color + "\n");
            }
        }
    }
    public static void dressMen(Clothes[] clothes) {
        for (Clothes clothing : clothes) {
            if (clothing instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) clothing;
                menClothing.dressMen();
                System.out.println("Size = " +  clothing.size.toString() + " (" + clothing.size.getDiscrition()+"); Price = " + clothing.coast + "; Color = " + clothing.color + "\n");
            }
        }
    }
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Skirt(Sizes.S, 120.0f, "Black"),
                new Skirt(Sizes.XS, 420.5f, "Pink"),
                new TShirt(Sizes.XXS, 500.0f, "White"),
                new TShirt(Sizes.M, 999.9f, "Red"),
                new Tie(Sizes.L, 145.9f, "Yellow"),
                new Tie(Sizes.M, 120.5f, "Blue")
        };

        dressWomen(clothes);
        dressMen(clothes);
    }
}
