package java_assignment_10_interfaces_and_packages.com.musicplayer.cdplayer;

import java_assignment_10_interfaces_and_packages.com.musicplayer.playableinterface.Playable;

public class CdPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music start playing in CD-Player");
    }

    @Override
    public void pause() {
        System.out.println("Music paused in CD-Player");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped in CD-Player");
    }
}
