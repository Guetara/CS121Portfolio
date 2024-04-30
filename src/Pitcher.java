public class Pitcher extends Player{
    private int earnedRuns, inningsPitched;

    public Pitcher(String name, int hits, int atBats, int earnedRuns, int inningsPitched){
        super(name, hits, atBats);
        this.earnedRuns = earnedRuns;
        this.inningsPitched = inningsPitched;
    }

    public double getEra(){
        return (9 * earnedRuns) / (double)inningsPitched;
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nHits: %d\nAt Bats: %d\nBatting Average: %.2f\nERA: %.2f\n", name, hits, atBats,
                getBattingAverage(), getEra());
    }
}
