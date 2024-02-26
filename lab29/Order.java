package lab29;

public interface Order {
    boolean Add(Item item); //добавления позиции в заказ (принимает ссылку типа Item), при этом возвращает логическое значение;
    boolean Remove(String name); //удаляет позицию из заказа по его названию (принимает название блюда или напитка в качестве параметра). Возвращает логическое значение;
    int GetNumberOfDeletedByName(String name); // удаляет все позиции с заданным именем (принимает название в качестве параметра). Возвращает число удаленных элементов;
    int GetNumberOfPositions(); //возвращает общее число позиций заказа в заказе;
    Item[] GetOrderArray();  //возвращает массив позиций заказа;
    double GetOrderCost(); //возвращает общую стоимость заказа;
    int GetNumberOfPositionsByName(String name); //возвращает число заказанных блюд или напитков (принимает название в качестве параметра);
    Item[] GetUniqueOrderArray(); // возвращает массив названий заказанных блюд и напитков (без повторов);
    Item[] GetOrderArraySortedByPrice(); //возвращает массив позиций заказа, отсортированный по убыванию цены.
    Customer GetCustomer();
    void SetCustomer(Customer customer);
}
