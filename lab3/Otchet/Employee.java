package lab3.Otchet;

public class Employee {
    public String fullname;
    public int salary;
    public Employee(String fullname, int salary){
        this.fullname=fullname;
        this.salary=salary;
    }
    public String GetName(){
        return fullname;
    }
    public int GetSalary(){
        return salary;
    }
}
