package java_assignment_15_stack_queue_linkedlist.Music_player.abstract_class;

import java_assignment_15_stack_queue_linkedlist.Music_player.interface_class.Song;
import java_assignment_15_stack_queue_linkedlist.Music_player.linkedlist.Node;

public abstract class Playlist {
    protected Node head;

    public abstract void addSong(Song ...song);
    public abstract boolean removeSong(String songName);



}
