package lab13;
import java.util.StringTokenizer;
public class ex3Adress {
    private String country, region, city, street, home, frame, apart;
    public ex3Adress(String inform){
        if(inform.contains(".") || inform.contains(";") ) {Token(inform);}
        else{Splity(inform);}
    }
    public void Splity(String info){
        String[] adress=info.split(",");
        this.country=adress[0];
        this.region=adress[1];
        this.city=adress[2];
        this.street=adress[3];
        this.home=adress[4];
        this.frame=adress[5];
        this.apart=adress[6];
    }

    public void Token(String info){
        StringTokenizer st = new StringTokenizer(info, " ;,.");
        this.country=st.nextToken();
        this.region=st.nextToken();
        this.city=st.nextToken();
        this.street=st.nextToken();
        this.home=st.nextToken();
        this.frame=st.nextToken();
        this.apart=st.nextToken();
    }
    public String toString(){
        return country+" "+region+" "+city+" "+street+" "+home+" "+frame+" "+apart;
    }
    public static void main(String[] args) {
        ex3Adress ob1=new ex3Adress("Россия, Тульская область, Тула, Ложевая, 3, 4, 34");
        System.out.println(ob1.toString());
        ex3Adress ob2=new ex3Adress("Россия, Ярославская область, Ярославль, Некрасова, 10, 1, 134");
        System.out.println(ob2.toString());
        ex3Adress ob3=new ex3Adress("Россия; Республика Татарстан. Казань, Островского, 14, 2, 81");
        System.out.println(ob3.toString());
        ex3Adress ob4=new ex3Adress("Россия, Воронежска область. Воронеж; Изыскателей, 5, 1; 79");
        System.out.println(ob4.toString());
    }
}
