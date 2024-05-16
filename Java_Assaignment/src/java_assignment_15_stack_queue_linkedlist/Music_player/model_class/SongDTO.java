package java_assignment_15_stack_queue_linkedlist.Music_player.model_class;

import java_assignment_15_stack_queue_linkedlist.Music_player.interface_class.Song;

public class SongDTO implements Song {

    private String songName;
    private String artistName;
    private String duration;
    private String genre;

    public SongDTO(String songName, String artistName, String duration, String genre) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public String getArtistName() {
        return artistName;
    }

    @Override
    public String getSongDuration() {
        return duration;
    }

    @Override
    public String getSongGenre() {
        return genre;
    }
}
