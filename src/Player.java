/*
Name: Yunsu Han
Date: September 21, 2019
Class section: APCS, E Period
Description: This class takes a player's name, number of points, rebounds, and assists.
It also compares whether one's points are higher than that of the other.
 */

class Player {
    private String name;
    private int points;
    private int rebounds;
    private int assists;

    public Player(){
        name = "";
        points = -100;
        rebounds = -100;
        assists = -100;
    }

    public Player(String name, int points, int rebounds, int assists){
        this.name = name;
        this.points = points;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getRebounds() {
        return rebounds;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assist) {
        this.assists = assist;
    }

    public void setPoints(int point) {
        this.points = point;
    }

    public void setRebounds(int rebound) {
        this.rebounds = rebound;
    }

    // This method compares one's points with that of the other.
    public boolean hasMorePoints(Player p2){
        return points > p2.points;
    }
}
