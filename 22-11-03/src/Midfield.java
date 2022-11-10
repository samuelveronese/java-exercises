public class Midfield extends AbstractSoccerPlayer {
    protected Midfield(String name) {
        super(name);
    }

    public boolean canUseHands() {
        return false;
    }
}
