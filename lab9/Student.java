package lab9;

public class Student {
    private String name;
    private int id;
    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public int getID(){
        return id;
    }

    public String getName(){
        return name;
    }

}
