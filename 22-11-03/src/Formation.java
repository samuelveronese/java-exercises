public class Formation {

    private SoccerPlayer[] players;

    public Formation(SoccerPlayer[] players) {
        this.players = players;
        if (!isValid())
            throw new IllegalArgumentException("invalid formation");
    }

    protected boolean isValid() {
        // ritorna true se e solo se la formazione è fatta da 11 giocatori, di cui
        // esattamente uno è un portiere
        int i = 0, g = 0;
        for (SoccerPlayer soccerPlayer : players) {
            if (soccerPlayer.canUseHands())
                g++;
            i++;
        }
        if (g == 1 && i == 11)
            return true;
        return false;
    }

    protected SoccerPlayer[] getPlayers() {
        return players;
    }

    public final String toString() {
        // ritorna i nomi dei giocatori della formazione, separati da virgola
        String ret = "";
        for (SoccerPlayer soccerPlayer : players) {
            ret += soccerPlayer.toString()+ " ";
        }

        return ret;

    }
}