package java_assignment_15_stack_queue_linkedlist.Music_player.musicplayercontrol;

import java_assignment_15_stack_queue_linkedlist.Music_player.abstract_class.Playlist;
import java_assignment_15_stack_queue_linkedlist.Music_player.interface_class.Song;
import java_assignment_15_stack_queue_linkedlist.Music_player.linkedlist.Node;

public class MusicPlayerModel extends Playlist {

    Node playlist;

    private MusicPlayerView musicPlayerView;
    public MusicPlayerModel(MusicPlayerView musicPlayerView){
        this.musicPlayerView = musicPlayerView;
    }
    @Override
    public void addSong(Song... songs) {
        for (Song song : songs) {
            Node newNode = new Node(song);
            if (playlist == null) {
                playlist = newNode;
            } else {
                Node current = playlist;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
        }
    }

    public void addSongAtSpecific(int position, Song song) {
        Node newNode = new Node(song);
        if (position == 0) {
            newNode.setNext(playlist);
            playlist = newNode;
        } else {
            Node current = playlist;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.getNext();
            }
            if (current != null) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            } else {
                musicPlayerView.showText("Invalid Position");
            }
        }
    }

    @Override
    public boolean removeSong(String songName) {
        if (playlist == null) {
            return false;
        }

        if (playlist.getSong().getSongName().equals(songName)) {
            playlist = playlist.getNext();
            return true;
        }

        Node current = playlist;
        while (current.getNext() != null) {
            if (current.getNext().getSong().getSongName().equals(songName)) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void displayPlaylist(){
        System.out.println();
        Node current = playlist;
        while(current != null){
            Song song = current.getSong();
            System.out.println(
                    "Song Name :  "+song.getSongName()+
                            " |  Song Artist :  "+song.getArtistName()+
                            " |  Song Duration :  "+song.getSongDuration()+
                            " |  Song Genre :  "+song.getSongGenre()
            );
            current = current.getNext();
        }
    }
}
