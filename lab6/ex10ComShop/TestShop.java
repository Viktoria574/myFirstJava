package lab6.ex10ComShop;

import java.util.Scanner;

public class TestShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Computer[] computerArray = shop.inputComputer();
        shop.searchComputer(computerArray);
        shop.deleteComputer(computerArray);
    }
}

