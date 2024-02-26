package lab6.ex6till9;

public class tester {
    public static void main (String args []){
        Printable[] info= {new Book("Тихий Дон"), new Shop("Мурзилка"), new Book("Старик и море")};
        for (Printable ob: info){
            ob.print();
        }
    }
}
