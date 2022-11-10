public class Defence extends AbstractSoccerPlayer {
    protected Defence(String name) {
        super(name);
    }

    public boolean canUseHands() {
        return false;
    }
}
