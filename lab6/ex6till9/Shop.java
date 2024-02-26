package lab6.ex6till9;

public class Shop implements Printable{
    private String name;
    public Shop(String name){
        this.name=name;
    }
    @Override
    public void print(){
        System.out.println("Журнал "+name);
    }
}
