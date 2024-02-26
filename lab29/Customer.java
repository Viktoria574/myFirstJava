package lab29;

import java.io.Serializable;

public final class Customer implements Serializable {
    private String firstName, secondName;
    private int age;
    private Address address;
    public Customer(String firstName, String secondName, int age, Address address) {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
        this.address=address;
    }
    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    public String toString() {
        return "\n\t\tПОКУПАТЕЛЬ Имя: " + this.firstName + " Фамилия: "+this.secondName + " Возраст: "+this.age + " || АДРЕС: "+this.address.toString();
    }
}