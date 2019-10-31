/*
Name: Yunsu Han
Date: September 21, 2019
Class section: APCS, E Period
Description: This class takes the current x- and y- coordinates and calculates
the total distance.
 */

class Taxicab {
    private int xCoord;
    private int yCoord;
    private int distance;

    public Taxicab(int newXCoord, int newYCoord){
        xCoord = newXCoord;
        yCoord = newYCoord;
        distance = 0;
    }

    public Taxicab(){
        xCoord = 0;
        yCoord = 0;
        distance = 0;
    }

    public int getXCoord(){
        return xCoord;
    }

    public int getYCoord(){
        return yCoord;
    }

    public int getDistanceTraveled(){
        return distance;
    }

    /* This method calculates the distance between the current x-coordinate
    and the new x-coordinate and adds that to the whole distance traveled. */
    public void moveX(int xCoord){
        System.out.println(Math.abs(xCoord - this.xCoord));
        distance += Math.abs(xCoord - this.xCoord);
    }

    /* This method calculates the distance between the current y-coordinate
    and the new y-coordinate and adds that to the whole distance traveled. */
    public void moveY(int yCoord){
        System.out.println(Math.abs(yCoord-this.yCoord));
        distance += Math.abs(yCoord - this.yCoord);
    }

}
