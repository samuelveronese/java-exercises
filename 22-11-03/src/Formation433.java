public class Formation433 extends Formation {

    public Formation433(SoccerPlayer[] players) {
        super(players);
    }

    protected boolean isValid() {
        int i = 0, g = 0, d = 0, m = 0, f = 0;
        for (SoccerPlayer soccerPlayer : getPlayers()) {
            if (soccerPlayer.canUseHands())
                g++;
            if (soccerPlayer instanceof Defence)
                d++;
            if (soccerPlayer instanceof Midfield)
                m++;
            if (soccerPlayer instanceof Forward)
                f++;
            i++;
        }
        if (g == 1 && d == 4 && m == 3 && f == 3 && i == 11)
            return true;
        return false;
    }

}
