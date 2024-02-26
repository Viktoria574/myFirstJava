package lab29;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order, Serializable {
    Customer customer;
    private int count=0;
    public DoublyNode<Item> orderList;
    public InternetOrder(Item[] items, Customer customer) {
        int buff;
        if (items==null) buff=count;
        else buff = items.length;
        for (int i =0;i<buff;i++)
            Add(items[i]);
        this.customer=customer;
    }

    @Override
    public Customer GetCustomer(){
        return customer;
    };
    @Override
    public void SetCustomer(Customer customer) {
        this.customer=customer;
    }

    @Override
    public boolean Add(Item item)
    {
        DoublyNode<Item> node = new DoublyNode<Item>(item);

        if (orderList == null)
        {
            orderList = node;
            orderList.setNext(node);
            orderList.setPrevious(node);
        }
        else
        {
            node.setPrevious(orderList.getPrevious());
            node.setNext(orderList);
            orderList.getPrevious().setNext(node);
            orderList.setPrevious(node);
        }
        count++;
        return true;
    }

    @Override
    public boolean Remove(String name)
    {
        boolean flag= false;
        DoublyNode<Item> current = orderList;
        Item item = current.getData();

        for(int i =0;i<count;i++) {
            if(current.getData().getName().equals(name)) {
                item = current.getData();
                flag = true;
            }
            current = current.getNext();
        }

        current = orderList;

        DoublyNode<Item> removedItem = null;
        if (count == 0 || !flag) return false;

        // поиск удаляемого узла
        do
        {
            if (current.getData() == item)
            {
                removedItem = current;
                break;
            }
            current = current.getNext();
        }
        while (current!=orderList);

        if (removedItem != null)
        {
            // если удаляется единственный элемент списка
            if (count==1)
                orderList = null;
            else
            {
                // если удаляется первый элемент
                if(removedItem==orderList)
                {
                    orderList = orderList.getNext();
                }
                removedItem.getPrevious().setNext(removedItem.getNext());
                removedItem.getNext().setPrevious(removedItem.getPrevious());
            }
            count--;
            return true;
        }
        return false;
    }

    @Override
    public double GetOrderCost() {
        DoublyNode<Item> current = orderList;
        double result=0;
        for(int i =0;i<count;i++) {
            result += current.getData().getPrice();
            current = current.getNext();
        }
        return result;
    }

    @Override
    public int GetNumberOfDeletedByName(String name) {
        int result = 0;
        for(int i =0;i<count;i++)
            if(Remove(name))
                result++;
        return result;
    }

    @Override
    public int GetNumberOfPositions() {
        return count;
    }

    @Override
    public Item[] GetOrderArray() {
        DoublyNode<Item> current = orderList;
        Item[] items = new Item[count];
        for(int i =0;i<count;i++) {
            items[i] = current.getData();
            current = current.getNext();
        }
        return items;
    }

    @Override
    public int GetNumberOfPositionsByName(String name) {
        DoublyNode<Item> current = orderList;
        int result =0;

        for(int i =0;i<count;i++) {
            if(current.getData().getName().equals(name)) {
                result+=1;
            }
            current = current.getNext();
        }
        return result;
    }

    @Override
    public Item[] GetOrderArraySortedByPrice() {
        Item[] array = GetOrderArray();
        boolean isSorted = false;
        Item buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i].getPrice() > array[i+1].getPrice()){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        return array;
    }

    @Override
    public Item[] GetUniqueOrderArray() {
        Item[] array = GetOrderArray();
        List<Integer> notUniqueIndex = new ArrayList<>();
        for(int i=0; i<array.length; i++) {
            for (int j=i+1; j<array.length; j++) {
                if(array[i] != array[j]) {
                    notUniqueIndex.add(j);
                }
            }
        }
        Item[] newArray = new Item[count-notUniqueIndex.size()];
        int cnt = 0;
        for(int i=0; i<array.length; i++) {
            if(!notUniqueIndex.contains(i)) {
                newArray[cnt] = array[i];
                cnt++;
            }
        }
        return newArray;
    }
}
