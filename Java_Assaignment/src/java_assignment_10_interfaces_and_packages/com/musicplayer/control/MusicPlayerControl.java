package java_assignment_10_interfaces_and_packages.com.musicplayer.control;


import java_assignment_10_interfaces_and_packages.com.musicplayer.cdplayer.CdPlayer;
import java_assignment_10_interfaces_and_packages.com.musicplayer.mp3player.Mp3Player;
import java_assignment_10_interfaces_and_packages.com.musicplayer.playableinterface.Playable;
import java_assignment_10_interfaces_and_packages.com.musicplayer.streamingplayer.StreamingPlayer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MusicPlayerControl {

    public void initiateControl() {
        Scanner scan = new Scanner(System.in);
        Mp3Player mp3Player = new Mp3Player();
        CdPlayer cdPlayer = new CdPlayer();
        StreamingPlayer streamingPlayer = new StreamingPlayer();

        int musicPlayerChoice = 0;
        Playable playable = null;
        boolean isDone = false;

        while (!isDone) {
            System.out.println("\nSelect the Music Player\n-------------------------\n1.MP3 - Player \n2.CD-Player \n3.Streaming-Player \n4.Exit");
            try {
                musicPlayerChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            switch (musicPlayerChoice) {
                case 1:
                    playable = mp3Player;
                    break;
                case 2:
                    playable = cdPlayer;
                    break;
                case 3:
                    playable = streamingPlayer;
                    break;
                case 4:
                    System.out.println("Exiting...");
                    isDone = true;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }
            System.out.println("Choose the control\n----------------\n1.Play The Music\n2.Pause The Music\n3.Stop The Music\n4.Back\n5.Exit");
            try {
                musicPlayerChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            switch (musicPlayerChoice) {
                case 1:
                    playable.play();
                    break;
                case 2:
                    playable.pause();
                    break;
                case 3:
                    playable.stop();
                    break;
                case 4:
                    continue;
                case 5:
                    System.out.println("Exiting...");
                    isDone = true;
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }
}
