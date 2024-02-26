package lab3;
import java.util.Random;
public class ex3raw {

    public static void main(String[] args) {
        int[] numbers= new int[4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            numbers[i] = rand.nextInt(89)+ 10;
            System.out.print(numbers[i] + " ");
        }
        int counter = 0;
        for(int j=0; j<3; j++){
            if(numbers[j]>numbers[j+1]){
                counter+=1;
            }
        }
        if (counter!=0){
            System.out.println("\nМассив нестрого возрастающий");
        }
        else{
            System.out.println("\nМассив строго возрастающий");
        }
    }
}