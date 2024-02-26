package lab17;

public class Employee {
    private String name;
    private double pay;
    private int hours;

    public Employee(String name, double pay, int hours) {
        this.name = name;
        this.pay=pay;
        this.hours=hours;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setHours(int hours){
        this.hours=hours;
    }
    public void setPay(double pay){
        this.pay=pay;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return hours*pay;
    }
}
