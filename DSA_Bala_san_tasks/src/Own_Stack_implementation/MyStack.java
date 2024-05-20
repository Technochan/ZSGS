package Own_Stack_implementation;

public class MyStack<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
        }
    }

    public void push(T item){
        Node<T> newNode = new Node<>(item);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public T pop(){
        if(isEmpty())
            return (T) "sorry";
        T data = head.data;
        head = head.next;
        size--;
        if(isEmpty())
            tail = null;

        return data;
    }

    public T peek(){
        if(isEmpty())
            return (T) "sorry";
        return head.data;

    }

    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }

    public void printQueue(){
        Node<T> queue = head;
        while(queue != null){
            System.out.print(queue.data+" ");
            queue = queue.next;
        }
        System.out.println();
    }

}
