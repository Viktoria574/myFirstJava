package lab29;

import java.util.HashMap;
import java.io.Serializable;
public class InternetOrderManager implements OrderManager, Serializable{
    private HashMap<Address, InternetOrder> orders = new HashMap<>();
    public void AddOrder(Address address, InternetOrder order) throws OrderAlreadyAddedException{
        if(orders.get(address)==order)
            throw new OrderAlreadyAddedException("OrderAlreadyAddedException");
        orders.put(address, order);
    }
    public Order GetOrder(Address address) {
        return orders.get(address);
    }
    public void DeleteOrder(Address address) {
        orders.remove(address);
    }
    public void AddPositionToOrder(Address address, Item item) {
        InternetOrder curr = orders.get(address);
        curr.Add(item);
        orders.replace(address, curr);
    }
    public Order[] GetOrdersArray() {
        return orders.values().toArray(new Order[0]);
    }
    public double GetOrdersCost() {
        double result=0;
        for(Order order: GetOrdersArray())
            result+=order.GetOrderCost();
        return result;
    }
    public int GetNumberOfPosition(String name) {
        int result=0;
        for(Order order: GetOrdersArray())
            result+=order.GetNumberOfPositionsByName(name);
        return result;
    }
}