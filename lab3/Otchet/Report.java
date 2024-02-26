package lab3.Otchet;
import java.text.NumberFormat;
import java.util.Locale;
public class Report {
    public static void generateReport(Employee[] worker){
        System.out.println("FullName \t\tSalary ");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        for(int i=0;i<worker.length; i++)
            System.out.printf("%-15s %5s %n", worker[i].GetName(), numberFormat.format(worker[i].GetSalary()));
    }
}
