/*
Name: Yunsu Han
Date: September 21, 2019
Class section: APCS, E Period
Description: This class assigns the players either of the five positions
and calculates the total points.
 */

class Team {
    private Player pointGuard;
    private Player shootingGuard;
    private Player smallForward;
    private Player powerForward;
    private Player center;

    public Team(Player pointGuard, Player shootingGuard, Player smallForward, Player powerForward, Player center){
        this.pointGuard = pointGuard;
        this.shootingGuard = shootingGuard;
        this.smallForward = smallForward;
        this.powerForward = powerForward;
        this.center = center;
    }

    public Player getPointGuard(){ return pointGuard; }

    public Player getShootingGuard(){
        return shootingGuard;
    }

    public Player getSmallForward(){
        return smallForward;
    }

    public Player getPowerForward(){
        return powerForward;
    }

    public Player getCenter(){
        return center;
    }

    public void setCenter(Player center) {
        this.center = center;
    }

    public void setPointGuard(Player pointGuard) {
        this.pointGuard = pointGuard;
    }

    public void setPowerForward(Player powerForward) {
        this.powerForward = powerForward;
    }

    public void setShootingGuard(Player shootingGuard) {
        this.shootingGuard = shootingGuard;
    }

    public void setSmallForward(Player smallForward) {
        this.smallForward = smallForward;
    }

    //This method calculates a team's total points.
    public int totalPoints(){
        return pointGuard.getPoints() + shootingGuard.getPoints() + smallForward.getPoints() +
                powerForward.getPoints() + center.getPoints();
    }
}
