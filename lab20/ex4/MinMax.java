package lab20.ex4;

public class MinMax <T extends Comparable<T>>{
    private T[] massive;

    public MinMax(T[] massive){
        this.massive=massive;
    }
    public T FindMini(){
        T mini=massive[0];
        for (T number: massive){
            if (mini.compareTo(number)>0){
                mini=number;
            }
        }
        return mini;
    }
    public T FindMax(){
        T maxi=massive[0];
        for (T number: massive){
            if (maxi.compareTo(number)<0){
                maxi=number;
            }
        }
        return maxi;
    }
    public static void main(String[] args){
        Integer[] a={28, 31, 15, 71, 34};
        MinMax<Integer> ob= new MinMax<Integer>(a);
        System.out.println("Минимальное число в массиве: "+ ob.FindMini());
        System.out.println("Максимальное число в массиве: "+ ob.FindMax());
    }
}
