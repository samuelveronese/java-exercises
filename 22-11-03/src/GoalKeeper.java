public class GoalKeeper extends AbstractSoccerPlayer {
    protected GoalKeeper(String name) {
        super(name);
    }

    public boolean canUseHands() {
        return true;
    }
}
