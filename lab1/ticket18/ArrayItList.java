package lab1.ticket18;

public class ArrayItList {
    private int[] elementData;

    public void setElementData(int[] elementData) {
        this.elementData = elementData;
    }

    public int longestSortedSequence() {
        int longest = 0;
        int c = 1;

        for (int i = 0; i < elementData.length - 1; ++i) {
            if (elementData[i] <= elementData[i + 1]) {
                ++c;
            } else {
                if (c > longest) {
                    longest = c;
                }
                c = 1;
            }
        }

        if (c > longest) {
            longest = c;
        }
        return longest;
    }
}
