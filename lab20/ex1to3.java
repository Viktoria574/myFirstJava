package lab20;
import java.io.Serializable;
class Animal {

}
public class ex1to3 <T extends Comparable,V extends Serializable,K extends Animal>{
    private T T_Type;//обобщенный тип
    private V V_Type;//значение
    private K K_Type;//ключ
    public ex1to3(T T_Type, V V_Type, K K_Type) {
        this.T_Type=T_Type;
        this.V_Type=V_Type;
        this.K_Type=K_Type;
    }
    public T getter1() {
        return T_Type;
    }
    public V getter2() {
        return V_Type;
    }
    public K getter3() {
        return K_Type;
    }
    public void printTypes() {
        System.out.println("Variable 1 class name: " + T_Type.getClass().getSimpleName());
        System.out.println("Variable 2 class name: " + V_Type.getClass().getSimpleName());
        System.out.println("Variable 3 class name: " + K_Type.getClass().getSimpleName());
    }
}
