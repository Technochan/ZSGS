package Own_Stack_implementation;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> queue = new MyStack<>();
        queue.push(10);
        queue.printQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        queue.printQueue();
        System.out.println(queue.size());


    }
}
