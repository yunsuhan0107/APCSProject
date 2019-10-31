/*
Name: Yunsu Han
Date: September 21, 2019
Class section: APCS, E Period
Description: This class takes the value of a box's height, width, and length
and calculates the box's volume and surface area.
 */

class Box {
    private double height;
    private double width;
    private double length;

    public Box (double newHeight, double newWidth, double newLength){
        height = newHeight;
        width = newWidth;
        length = newLength;
    }

    public Box(){
        height = 1;
        width = 1;
        length = 1;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // This method calculates the volume of the box.
    public double calcVolume(){
        return height * width * length;
    }

    // This method calculates the surface area of the box.
    public double calcSurfaceArea(){
        return 2 * (height * width + width * length + length * height);
    }
}
