package java_assignment_10_interfaces_and_packages.com.musicplayer.mp3player;

import java_assignment_10_interfaces_and_packages.com.musicplayer.playableinterface.Playable;

public class Mp3Player implements Playable {
    @Override
    public void play() {
        System.out.println("Music start playing int MP3-Player");
    }

    @Override
    public void pause() {
        System.out.println("Music paused in MP3-Player");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped in MP3-Player");
    }
}
