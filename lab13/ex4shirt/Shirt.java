package lab13.ex4shirt;

public class Shirt {
    private String number, name, color, size;
    public Shirt(String number, String name, String color, String size){
        this.number=number;
        this.name=name;
        this.color=color;
        this.size=size;
    }

    public String ToString(){
        return "Number: "+number+" Name: "+name+" Color: "+color+" Size: "+size;
    }
}
