package lab4.second_part;
public class Phone {
    public int number;
    public String model;
    public int weight;

    public Phone(int number, String model, int weight) {
        this.model = model;
        this.weight = weight;
        this.number = number;
        new Phone(number, model);
    }

    public Phone(int number, String model) {
        this.model = model;
        this.weight = 0;
        this.number = number;
    }

    public Phone() {
        this.model = "";
        this.weight = 0;
        this.number = 0;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name );
    }

    public int getNumber() {
        return this.number;
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " Номер = " + number);
    }

    public void sendMessage(int... numbers) {
        for (int number : numbers) {
            System.out.println("Номеру: " + number);
        }
    }
}