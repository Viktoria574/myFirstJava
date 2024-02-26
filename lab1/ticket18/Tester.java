package lab1.ticket18;

public class Tester {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 9, 7, -3, 0, 42, 308, 17};
        ArrayItList ail = new ArrayItList();
        ail.setElementData(arr);
        System.out.println(ail.longestSortedSequence());
    }
}
