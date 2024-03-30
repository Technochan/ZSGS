package java_assignment_7_class_and_object_and_encapsulation;

import java.util.ArrayList;
import java.util.List;

public class TeamPlayerDTO {

    // Class Team
    public static class Team {
        private String name;
        private String city;
        private String division;
        private List<Player> players;

        public Team(String name, String city, String division) {
            this.name = name;
            this.city = city;
            this.division = division;
            this.players = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public void addPlayer(Player player) {
            players.add(player);
        }

        public void removePlayer(Player player) {
            players.remove(player);
        }

        public void playGame() {
            System.out.println("Team " + name + " is playing a game");
            for (Player player : players) {
                player.playGame();
            }
        }

        public void hireCoach() {
            System.out.println("Hiring a coach for team " + name );
        }
    }

    // Class Player
    public static class Player {
        private String name;
        private String position;
        private int jerseyNumber;

        //Can use this or else setter getter method
        public Player(String name, String position, int jerseyNumber) {
            this.name = name;
            this.position = position;
            this.jerseyNumber = jerseyNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getJerseyNumber() {
            return jerseyNumber;
        }

        public void setJerseyNumber(int jerseyNumber) {
            this.jerseyNumber = jerseyNumber;
        }

        public void playGame() {
            System.out.println("Player " + name + " is playing \nPosition "+position +" \nJerseyName "+jerseyNumber+"\n" );
        }
        public void train(){
            System.out.println("Player "+name+" is Training");
        }

    }

    public static void main(String[] args) {
        // Creatung a team
        Team teamOne = new Team("Team One", "City One", "Division 1");

        // Creating players
        Player player1 = new Player("Player 1", "Striker", 11);
        Player player2 = new Player("Player 2", "GoalKeeper", 99);

        // Adding player to the team
        teamOne.addPlayer(player1);
        teamOne.addPlayer(player2);

        // Start a game
        teamOne.playGame();
    }
}
