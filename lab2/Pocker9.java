package lab2;
import java.util.Scanner;
import java.util.Random;
public class Pocker9 {
    private String[] numbers={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] suite={"\u29EB", "\u2764", "\u2663", "\u2660"};
    private Card[] AllCards= new Card[52];
    private void CreateCard(){
        int n=0;
        for(int i=0; i<suite.length; i++){
            for(int j=0; j<numbers.length; j++){
                AllCards[n]=new Card(numbers[j],suite[i], 1);
                n++;
            }
        }
    }
    public Pocker9(int n){
        this.CreateCard();
        Random random = new Random();
        for(int i=0; i<n; i++){
            int counter=0;
            while(counter!=5){
                int rand=random.nextInt(52);
                if (AllCards[rand].GetIndex()!=0){
                    AllCards[rand].printCard();
                    AllCards[rand].SetIndex(0);
                    counter+=1;
                }
            }
            System.out.print("   ");
        }
    }
}
