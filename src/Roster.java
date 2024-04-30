import java.util.LinkedList;
public class Roster {
    LinkedList<Player> playerList = new LinkedList<>();
    LinkedList<Pitcher> pitcherList = new LinkedList<>();

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public Player getPlayer(String name){
        Player foundPlayer = null;

        for(Player player : playerList){
            if(player.getName().equals(name)){
                foundPlayer = player;
                break;
            }
        }

        return foundPlayer;
    }

    public void removePlayer(String name){
        if(getPlayer(name) != null){
            Player player = getPlayer(name);
            playerList.remove(player);
        }
    }

    public void addPitcher(Pitcher pitcher){
        pitcherList.add(pitcher);
    }

    public Pitcher getPitcher(String name){
        Pitcher foundPitcher = null;

        for(Pitcher pitcher : pitcherList){
            if(pitcher.getName().equals(name)){
                foundPitcher = pitcher;
                break;
            }
        }

        return foundPitcher;
    }

    public void removePitcher(String name){
        if(getPitcher(name) != null){
            Pitcher pitcher = getPitcher(name);
            pitcherList.remove(pitcher);
        }
    }

    public StringBuilder getAllPlayers() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Player player : playerList) {
            stringBuilder.append(player.toString());
            stringBuilder.append("\n");
        }

        return stringBuilder;
    }

    public StringBuilder getAllPitchers(){
        StringBuilder stringBuilder = new StringBuilder();

        for(Pitcher pitcher : pitcherList){
            stringBuilder.append(pitcher.toString());
            stringBuilder.append("\n");
        }

        return stringBuilder;
    }
}
