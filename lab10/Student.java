package lab10;

public class Student {
    private String name;
    private String  SecondName;
    private String speciality;
    private int cource;
    private double group;
    public Student(String name, String SecondName, String speciality, int cource, double group){
        this.name=name;
        this.SecondName=SecondName;
        this.speciality=speciality;
        this.cource=cource;
        this.group=group;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public double getGroup() {
        return group;
    }

    public int getCource() {
        return cource;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(double group) {
        this.group = group;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
