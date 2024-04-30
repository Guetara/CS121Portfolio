public class Player {
    protected String name;
    protected int hits, atBats;

    public Player (String name, int hits, int atBats){
        this.name = name;
        this.hits = hits;
        this.atBats = atBats;
    }

    public String getName(){
        return name;
    }

    public double getBattingAverage(){
        return (double)hits / atBats;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nHits: %d\nAt Bats: %d\nBatting Average: %.2f\n", name, hits, atBats,
                getBattingAverage());
    }
}
