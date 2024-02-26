package lab29;

import java.util.HashMap;


public interface OrderManager{
    Order GetOrder(Address address);
    void DeleteOrder(Address address);
    void AddPositionToOrder(Address address, Item item);
    Order[] GetOrdersArray();
    double GetOrdersCost();
    int GetNumberOfPosition(String name);
}
