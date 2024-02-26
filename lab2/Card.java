package lab2;

public class Card {
    private String size;
    private String suit;
    private int index;
    public Card(String size, String suit, int index){
        this.size=size;
        this.suit=suit;
        this.index=index;
    }
    public int GetIndex(){return index;};
    public void SetIndex(int index){this.index=index;}
    public void printCard(){
        System.out.print(size+suit+" ");
    }
}
