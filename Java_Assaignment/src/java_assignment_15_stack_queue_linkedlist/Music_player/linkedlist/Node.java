package java_assignment_15_stack_queue_linkedlist.Music_player.linkedlist;

import java_assignment_15_stack_queue_linkedlist.Music_player.interface_class.Song;

public class Node {
    private Song song;
    private Node next;

    public Node(Song song) {
        this.song = song;
        this.next = null;
    }

    public Song getSong() {
        return song;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
