package lab4.second_part;
import java.util.Scanner;

public class TestMatrix {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Введите размер матрицы:");
        int x=in.nextInt();
        int y=in.nextInt();
        int[][] Array=new int[x][y];
        System.out.println("Заполните матрицу:");
        for(int i=0; i<x; i++) {
            for (int j = 0; j < y; j++) {
                Array[j][i] =in.nextInt();
            }
        }
        Matrix ob=new Matrix(x, y, Array);
        ob.Print();
        ob.Addition(Array);
        ob.Print();
        ob.Mult(2);
        ob.Print();
    }
}
