package lab4.second_part;
public class TestPhone {
    public static void main(String args[]){
        Phone first=new Phone(1234, "Apple", 200);
        Phone second=new Phone(5678, "Samsung", 400);
        Phone third=new Phone(9012, "Xiaomi", 600);
        System.out.println(first.getNumber());
        second.receiveCall("2222");
        first.sendMessage(123,456,789,440,404);
    }
}
