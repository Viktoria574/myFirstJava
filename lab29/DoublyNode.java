package lab29;

import java.io.Serializable;

public class DoublyNode<T> implements Serializable
{
    private T Data;
    private DoublyNode<T> Previous;
    private DoublyNode<T> Next;
    public DoublyNode(T data)
    {
        Data = data;
    }

    public T getData() {
        return Data;
    }
    public DoublyNode<T> getPrevious() {
        return Previous;
    }

    public DoublyNode<T> getNext() {
        return Next;
    }

    public void setData(T data) {
        Data = data;
    }

    public void setPrevious(DoublyNode<T> previous) {
        Previous = previous;
    }

    public void setNext(DoublyNode<T> next) {
        Next = next;
    }
}