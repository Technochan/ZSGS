package java_assignment_10_interfaces_and_packages.com.musicplayer;

// Define an interface named Playable with methods like play() , pause() , and stop() . Implement this interface in classes representing different types of music players such as MP3Player , CDPlayer , and StreamingPlayer . Allow the user to control the playback of these players through the implemented interface.

import java_assignment_10_interfaces_and_packages.com.musicplayer.control.MusicPlayerControl;

public class MusicPlayerMain {
    public static void main(String[] args) {
        new MusicPlayerControl().initiateControl();
    }
}
