package java_assignment_15_stack_queue_linkedlist.Music_player.musicplayercontrol;


import java_assignment_15_stack_queue_linkedlist.Music_player.model_class.SongDTO;

import java.util.Scanner;

public class MusicPlayerView {

    MusicPlayerModel musicPlayerModel;
    Scanner scan ;

    public MusicPlayerView(){
        musicPlayerModel = new MusicPlayerModel(this);
        scan = new Scanner(System.in);
    }

    public void init(){
        createPlaylist();
        showMusicOptions();
    }

    private void showMusicOptions() {

        char choice;
        do{
            musicPlayerModel.displayPlaylist();
            System.out.println(
                            "\n\n1. Add Song" +
                            "\n2. Remove Song" +
                            "\n3. Exit"
            );
            choice = scan.next().charAt(0);
            switch (choice){
                case '1' : addSong();
                break;
                case '2' : removeSong();
                break;
                case '3' : break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while(choice != '3');
    }

    private void addSong() {
        System.out.println("\n\n1. Add at last\n2.Add at Specific position");
        char choice = scan.next().charAt(0);
        if(choice == '1'){
            getSomeDetails(choice,-1);
        } else if (choice == '2') {
            musicPlayerModel.displayPlaylist();
            System.out.println("Enter the song position in Numeric Value");
            int pos = scan.nextInt();
            getSomeDetails(choice,pos);
        } else {
            System.out.println("Invalid Choice");
            addSong();
        }
    }

    private void getSomeDetails(char choice,int pos) {
        System.out.println("Enter the song name");
        String name = scan.next();
        System.out.println("Enter the song artist");
        String artist = scan.next();
        System.out.println("Enter the song duration");
        String duration = scan.next();
        System.out.println("Enter the song genre");
        String genre = scan.next();
        SongDTO song = new SongDTO(name,artist,duration,genre);
        if(choice == '1'){
            musicPlayerModel.addSong(song);
        } else {
            musicPlayerModel.addSongAtSpecific(pos,song);
        }
    }

    private void removeSong() {
        System.out.println("\nEnter the song name correctly");
        String name = scan.next();
        musicPlayerModel.removeSong(name);
    }

    public void showText(String text){
        System.out.println(text);
    }


    private void createPlaylist() {
        SongDTO song1 = new SongDTO("Song1","Chan","4.05","Melody");
        SongDTO song2 = new SongDTO("Song2","Shan","3.25","Melody");
        SongDTO song3 = new SongDTO("Song3","Varun","2.17","Classical");
        SongDTO song4 = new SongDTO("Song4","Dhilip","6.25","Hip-Hop");
        SongDTO song5 = new SongDTO("Song5","Arun","1.15","Rock");
        musicPlayerModel.addSong(song1,song2,song3,song4,song5);
    }

}
