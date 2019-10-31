public class PlayerTeamClient {
    public static void main(String[] args) {
        Player p1 = new Player("Charlotte", 24, 10, 7);
        Player p2 = new Player("Emily", 21, 13, 9);
        Player p3 = new Player("Anne", 20, 10, 8);
        Player p4 = new Player("Jane", 19, 10, 10);
        Player p5 = new Player("Mary", 18, 11, 8);
        p5.setRebounds(12);

        Team team1 = new Team(p1, p2, p3, p4, p5);

        Player p = team1.getPowerForward();
        System.out.println(p.getName());
        System.out.println(team1.totalPoints());
    }
}
