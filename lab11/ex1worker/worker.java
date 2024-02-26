package lab11.ex1worker;
import java.util.Date;
public class worker {
    private String surname;
    private Date startDate, endDate;

    public worker(String surname, Date startDate, Date endDate) {
        this.surname=surname;
        this.startDate=startDate;
        this.endDate=endDate;
    }
    public String toString() {
        return "Фамилия: "+surname + ";\t Начало задания: "+startDate+";\t Конец задания: "+endDate;
    }
}
