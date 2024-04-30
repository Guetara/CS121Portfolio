import java.util.Scanner;

public class Menu {
    Scanner scnr = new Scanner(System.in);
    Roster roster = new Roster();

    public void displayMenu(){
        boolean isThree = false;
        int userNum;

        System.out.println("Welcome to Ball State's baseball roster application!");

        while(!isThree){
            System.out.println("\n******** Main Menu *******\n");
            System.out.println("Please make a selection:");
            System.out.println("1) Access player menu");
            System.out.println("2) Access pitcher menu");
            System.out.println("3) Exit");
            System.out.print(">> ");

            userNum = Integer.parseInt(scnr.nextLine());

            switch(userNum){
                case 1: playerMenu();
                        break;
                case 2: pitcherMenu();
                        break;
                case 3: isThree = true;
                        System.out.println("Thank you for using Ball State's baseball roster application!");
                        break;
                default: System.out.println("That is an invalid number");
            }
        }
    }

    public void playerMenu(){
        boolean isFive = false;
        int userNum;

        while(!isFive){
            System.out.println("\n******** Player Menu *******\n");
            System.out.println("Please make a selection:");
            System.out.println("1) Add a player");
            System.out.println("2) Remove a player");
            System.out.println("3) Display a player");
            System.out.println("4) Display all players");
            System.out.println("5) Exit");
            System.out.print(">> ");

            userNum = Integer.parseInt(scnr.nextLine());

            switch(userNum){
                case 1: addPlayer();
                        break;
                case 2: removePlayer();
                        break;
                case 3: displayPlayer();
                        break;
                case 4: System.out.print("\n" + roster.getAllPlayers());
                        break;
                case 5: isFive = true;
                        break;
                default: System.out.println("That is an invalid number");
            }
        }
    }

    public void addPlayer(){
        String name;
        int hits, atBats;

        System.out.print("\nEnter the player's name: ");
        name = scnr.nextLine();

        System.out.print("Enter the player's hits: ");
        hits = Integer.parseInt(scnr.nextLine());

        System.out.print("Enter the player's at bats: ");
        atBats = Integer.parseInt(scnr.nextLine());

        Player player = new Player(name, hits, atBats);

        roster.addPlayer(player);

        System.out.println("\n" + name + " was added to the roster.");
    }

    public void removePlayer(){
        String name;
        Player player;

        System.out.print("\nEnter the player's name you wish to remove: ");
        name = scnr.nextLine();

        player = roster.getPlayer(name);

        if(player == null){
            System.out.println("That name is invalid.");
            return;
        }

        System.out.println("\n" + name + " was removed from the roster");

        roster.removePlayer(name);
    }

    public void displayPlayer(){
        String name;
        Player player;

        System.out.print("\nEnter the name of player you wish to display: ");
        name = scnr.nextLine();

        player = roster.getPlayer(name);

        if(player == null){
            System.out.println("That name is invalid.");
            return;
        }

        System.out.println("\n" + player);
    }

    public void pitcherMenu(){
        boolean isFive = false;
        int userNum;

        while(!isFive) {
            System.out.println("\n******** Pitcher Menu *******\n");
            System.out.println("Please make a selection:");
            System.out.println("1) Add a pitcher");
            System.out.println("2) Remove a pitcher");
            System.out.println("3) Display a pitcher");
            System.out.println("4) Display all pitchers");
            System.out.println("5) Exit");
            System.out.print(">> ");

            userNum = Integer.parseInt(scnr.nextLine());

            switch(userNum){
                case 1: addPitcher();
                        break;
                case 2: removePitcher();
                        break;
                case 3: displayPitcher();
                        break;
                case 4: System.out.print("\n" + roster.getAllPitchers());
                        break;
                case 5: isFive = true;
                        break;
                default: System.out.println("That is an invalid number.");
            }
        }
    }

    public void addPitcher(){
        String name;
        int hits, atBats, earnedRuns, inningsPitched;

        System.out.print("\nEnter the pitcher's name: ");
        name = scnr.nextLine();

        System.out.print("Enter the pitcher's hits: ");
        hits = Integer.parseInt(scnr.nextLine());

        System.out.print("Enter the pitcher's at bats: ");
        atBats = Integer.parseInt(scnr.nextLine());

        System.out.print("Enter the earned runs against the pitcher: ");
        earnedRuns = Integer.parseInt(scnr.nextLine());

        System.out.print("Enter the innings pitched by the pitcher: ");
        inningsPitched = Integer.parseInt(scnr.nextLine());

        Pitcher pitcher = new Pitcher(name, hits, atBats, earnedRuns, inningsPitched);

        roster.addPitcher(pitcher);

        System.out.println("\n" + name + " was added to the roster.");
    }

    public void removePitcher(){
        String name;
        Pitcher pitcher;

        System.out.print("\nEnter the name of the pitcher you want removed: ");
        name = scnr.nextLine();

        pitcher = roster.getPitcher(name);

        if(pitcher == null){
            System.out.println("That name is invalid.");
            return;
        }

        System.out.println("\n" + name + " was removed from the roster");
        roster.removePitcher(name);
    }

    public void displayPitcher(){
        String name;
        Pitcher pitcher;

        System.out.print("\nEnter the pitcher's name you wish to display: ");
        name = scnr.nextLine();

        pitcher = roster.getPitcher(name);

        if(pitcher == null){
            System.out.println("That name is invalid.");
            return;
        }

        System.out.println("\n" + pitcher);
    }
}
