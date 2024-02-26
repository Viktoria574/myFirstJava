package lab29;

import java.io.Serializable;
import java.util.HashMap;

public class TableOrderManager implements OrderManager, Serializable {
    HashMap<Address, TableOrder> orders = new HashMap<>();
    public void AddOrder(Address address, TableOrder order) throws OrderAlreadyAddedException{
        if(orders.get(address)==order)
            throw new OrderAlreadyAddedException("OrderAlreadyAddedException");
        orders.put(address, order);
    }
    @Override
    public Order GetOrder(Address address){
        return orders.get(address);
    }
    public void DeleteOrder(Address address) {
        orders.remove(address);
    }
    public void AddPositionToOrder(Address address, Item item) {
        TableOrder curr = orders.get(address);
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