package lab21;
import java.util.ArrayList;
public class ClassOb {
    private static Object[] massive = {"String", 3.14d, 3.14f, 1, 'a'};
    public static Object returnByIndex(int index) {
        return massive[index];
    }
    public static void print() {
        ArrayList<Object> ar = new ArrayList<Object>();
        for(int i =0; i< massive.length;i++) {
            ar.add(massive[i]);
        }
        for(int i =0;i<5;i++) {
            System.out.print(ar.get(i)+" ");
        }
    }
    public static void main(String[] args){
        System.out.println(ClassOb.returnByIndex(2));
        ClassOb.print();
    }
}
