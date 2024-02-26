package lab9;

import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Задача 1
        Student[] iDNumbers = {new Student("Сидоров", 123),
                new Student("Иванов", 205),
                new Student("Васильев", 893),
                new Student("Петров", 145),
                new Student("Степанов", 238)};
        Student od;
        //Сортировка вставками по id
        for(int i=1; i<iDNumbers.length; i++) {
            for (int j = i; j > 0 && iDNumbers[j - 1].getID() > iDNumbers[j].getID(); j--) {
                od=iDNumbers[j - 1];
                iDNumbers[j - 1]=iDNumbers[j];
                iDNumbers[j]=od;
            }
        }
        System.out.println("Список студетнов: ");
        for (Student student : iDNumbers) {
            System.out.println(student.getID()+" "+student.getName());
        }
    }
}
