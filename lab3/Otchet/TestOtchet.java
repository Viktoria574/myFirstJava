package lab3.Otchet;

import java.util.Scanner;

public class TestOtchet {
    public static void main(String args[]){
        Employee[] worker = {
                new Employee("Jane Doe", 30000),
                new Employee("John Doe", 5000),
                new Employee("Jacob Doe", 100000),
        };
        Report.generateReport(worker);
    }
}
