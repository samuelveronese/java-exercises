public class Myself implements SoccerPlayer {

    private String name;
    private int yearOfBirth;

    public Myself(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString() {
        return name;
    }

    public boolean canUseHands() {
        if (yearOfBirth % 2 == 0)
            return false;
        return true;
    }

}
