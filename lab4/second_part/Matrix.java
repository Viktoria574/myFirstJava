package lab4.second_part;
import java.util.Scanner;
public class Matrix {
    private int[][] Array;
    private int column, line;
    public Matrix(int column, int line, int[][] Array){
        this.column=column;
        this.line=line;
        this.Array=Array;
    }
    public void Addition(int[][] secondMatrix){
        for(int i=0; i<column; i++) {
            for (int j = 0; j < line; j++) {
                Array[i][j] += secondMatrix[i][j];
            }
        }
    }
    public void Mult(int number){
        for(int i=0; i<column; i++) {
            for (int j = 0; j < line; j++) {
                Array[i][j] *= number;
            }
        }
    }
    public void Print(){
        System.out.println("Матрица:");
        for(int i=0; i<column; i++) {
            for (int j = 0; j < line; j++) {
                System.out.print(Array[j][i]+" ");
            }
            System.out.println();
        }
    }
}
