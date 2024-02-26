package lab10;

import java.util.ArrayList;
import java.util.Collections;

public class SortingStudentsByGPA implements Comparator<Student>{
    private ArrayList <Student> iDNumber=new ArrayList<Student>();
    public void setArray(){
        iDNumber.add(new Student("Артем", "Иванов", "Инженер", 2, 4.9));
        iDNumber.add(new Student("Алина", "Фомова", "Историк", 1, 3.8));
        iDNumber.add(new Student("Иван", "Соколов", "Переводчик", 2, 4.7));
        iDNumber.add(new Student("Александр", "Сидоров", "Рекламодатель", 4, 3.5));
        iDNumber.add(new Student("Ирина", "Петрова", "Тренер", 5, 5));
    }
    public void outArray(){
        System.out.println("");
        for(Student students: iDNumber){
            System.out.println(students.getName()+" "+students.getSecondName()+" "+students.getSpeciality()+" "+students.getCource()+" "+students.getGroup());
        }
        System.out.println("");
    }
    public int SizeArray(){
        return iDNumber.size();
    }
    public Student[] getArray(){
        Student[] array = iDNumber.toArray(new Student[0]);
        return array;
    }
    public void magicArray(Student[] array){
        iDNumber.clear();
        Collections.addAll(iDNumber, array);
    }
    @Override
    //Быстрая сортировка по среднему баллу студентов
    public void quicksort(int low, int high){
        if (low >= high) return;

        int middle = low + (high - low) / 2;//выбираем середину
        double border = iDNumber.get(middle).getGroup();

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (iDNumber.get(i).getGroup() > border) i++;
            while (iDNumber.get(j).getGroup() < border) j--;
            if (i <= j) {
                Student help = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, help);
                i++;
                j--;
            }
        }
        if (low < j)  quicksort( low, j);
        if (high > i) quicksort( i, high);
    }
    //Быстрая сортировка по курсу студентов
    @Override
    public void quicksortCource(int low, int high){
        if (low >= high) return;

        int middle = low + (high - low) / 2;//выбираем середину
        double border = iDNumber.get(middle).getCource();

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (iDNumber.get(i).getCource() > border) i++;
            while (iDNumber.get(j).getCource() < border) j--;
            if (i <= j) {
                Student help = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, help);
                i++;
                j--;
            }
        }
        if (low < j)  quicksortCource( low, j);
        if (high > i) quicksortCource( i, high);
    }
    @Override
    public Student[] divide(Student[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        Student[] arrayLeft = new Student[array.length / 2];
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);

        Student[] arrayRight = new Student[array.length - array.length / 2];
        System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);

        arrayLeft = divide(arrayLeft);
        arrayRight = divide(arrayRight);

        return mergeArray(arrayLeft , arrayRight);
    }
    @Override
    public Student [] mergeArray(Student [] arrayLeft, Student [] arrayRight) {

        Student [] arrayAll = new Student[arrayLeft.length + arrayRight.length];
        int positionLeft = 0, positionRight = 0;

        for (int i = 0; i < arrayAll.length; i++) {
            if (positionLeft == arrayLeft.length) {
                arrayAll[i] = arrayRight[positionRight];
                positionRight++;
            } else if (positionRight == arrayRight.length) {
                arrayAll[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else if (arrayLeft[positionLeft].getGroup() >arrayRight[positionRight].getGroup()) {
                arrayAll[i] = arrayLeft[positionLeft];
                positionLeft++;
            } else {
                arrayAll[i] = arrayRight[positionRight];
                positionRight++;
            }
        }
        return arrayAll;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA ob=new SortingStudentsByGPA();
        ob.setArray();
        ob.quicksort(0, ob.SizeArray()-1);
        System.out.println("Список студентов отсортированных по среднему баллу быстрой сортировкой:");
        ob.outArray();
        ob.quicksortCource(0, ob.SizeArray()-1);
        System.out.println("Список студентов отсортированных по курсу быстрой сортировкой:");
        ob.outArray();
        System.out.println("Список студентов отсортированных по среднему баллу сортировкой слияния:");
        ob.magicArray(ob.divide(ob.getArray()));
        ob.outArray();
    }
}
