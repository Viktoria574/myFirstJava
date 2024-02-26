package lab2;
import java.util.Scanner;
public class Dog {
    private String name;
    private int years;

    public Dog(String name, int years){
        this.name=name;
        this.years=years;
    }

    public void setName(String name){this.name=name;}
    public void setYears(String name){this.name=name;}
    public String getName(){return name;}
    public int getYears(){return years;}
    public int HumanYears(){return years*7;}
    public String ToString(){
        return name+" "+Integer.toString(years);
    }
}
