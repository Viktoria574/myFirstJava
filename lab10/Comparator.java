package lab10;

public interface Comparator<E> {
    void quicksort(int low, int high);
    void quicksortCource(int low, int high);
    Student[] divide(Student[] array);
    Student [] mergeArray(Student [] arrayLeft, Student [] arrayRight);
}
