public abstract class AbstractSoccerPlayer implements SoccerPlayer {
    private String name;

    protected AbstractSoccerPlayer(String name) {
        this.name = name;
    }

    public final String toString() {
        return name;
    }
}