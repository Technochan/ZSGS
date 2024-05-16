package java_assignmnet_13_arraylist.circular_buffer;

import java.util.ArrayList;
// Create a class implementing a circular buffer using an ArrayList of Strings for a messaging service. This buffer should have a fixed size and overwrite the oldest element when full.
public class CircularBuffer {
    private ArrayList<String> buffer;
    private int capacity;
    private int head;
    private int size;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayList<>(capacity);
        this.head = 0;
        this.size = 0;
        for (int i = 0; i < capacity; i++) {
            buffer.add("Empty");
        }
    }

    public void addMessage(String message) {
        if (size < capacity) {
            buffer.set((head + size) % capacity, message);
            size++;
        } else {
            buffer.set(head, message);
            head = (head + 1) % capacity;
        }
    }

    public void displayBuffer() {
        System.out.println("Contents of the Circular Buffer:");
        for (int i = 0; i < size; i++) {
            int index = (head + i) % capacity;
            System.out.println(buffer.get(index));
        }
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(4);

        cb.addMessage("First message");
        cb.displayBuffer();
        System.out.println(); cb.displayBuffer();
        System.out.println();
        cb.addMessage("Second message");
        cb.displayBuffer();
        System.out.println();
        cb.addMessage("Third message");
        cb.displayBuffer();
        System.out.println();
        cb.addMessage("Fourth message");
        cb.displayBuffer();
        System.out.println();

        // Override
        cb.addMessage("Fifth message");
        cb.displayBuffer(); System.out.println();

        cb.addMessage("Sixth message");
        cb.displayBuffer();
    }
}
