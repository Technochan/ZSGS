package java_assignment_10_interfaces_and_packages.com.musicplayer.streamingplayer;

import java_assignment_10_interfaces_and_packages.com.musicplayer.playableinterface.Playable;

public class StreamingPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Music start playing in Steaming-Player");
    }

    @Override
    public void pause() {
        System.out.println("Music paused in Steaming-Player");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped in Steaming-Player");
    }
}
