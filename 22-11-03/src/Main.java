public class Main {
    public static void main(String[] args) {
        GoalKeeper goalKeeper = new GoalKeeper("Buffon");
        Defence defence1 = new Defence("Skriniar");
        Defence defence2 = new Defence("Bastoni");
        Defence defence3 = new Defence("Chiellini");
        Defence defence4 = new Defence("Cannavaro");
        Midfield midfield1 = new Midfield("Barella");
        Midfield midfield2 = new Midfield("Tonali");
        Midfield midfield3 = new Midfield("Eriksen");
        Forward forward1 = new Forward("Lukaku");
        Forward forward2 = new Forward("Ronaldo");
        Forward forward3 = new Forward("Messi");

        SoccerPlayer[] players = { goalKeeper, defence1, defence2, defence3, defence4, midfield1, midfield2, midfield3,
                forward1, forward2, forward3 };

        // Formation formation = new Formation(players);

        Formation433 formation433 = new Formation433(players);
        

        System.out.println("" + formation433.toString() + " valid? " + formation433.isValid());

    }
}
