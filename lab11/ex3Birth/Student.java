package lab11.ex3Birth;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Student {
    private Date Birthday;
    public Student(Date date){
        this.Birthday = date;
    }

    public void to() {
        /*SimpleDateFormat dateFormatter = new SimpleDateFormat("E, M-d");
        return "Format 1: " + dateFormatter.format(Birthday);
        dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        return "Format 2: " + dateFormatter.format(Birthday);
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
        return "Format 3: " + dateFormat3.format(Birthday);*/
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yy");
        System.out.println("Краткая запись дня рождения: " + dateFormatter.format(Birthday));
        dateFormatter = new SimpleDateFormat("EEE, d MMMM, yyyy");
        System.out.println("Средняя запись дня рождения: " + dateFormatter.format(Birthday));
        dateFormatter = new SimpleDateFormat("EEEE, d MMMM , yyyy, 'at' hh:mm:ss a zzz");
        System.out.println("Полная запись дня рождения: " + dateFormatter.format(Birthday));
    }
}
