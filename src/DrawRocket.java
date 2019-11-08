/*
Name: Yunsu Han
Date: October 26, 2019
Class: APCS, E Section
Description: This program uses nested for loops to draw a rocket.
 */

public class DrawRocket {
    public static final int NUM = 3;

    public static void main(String[] args) {
        roofAndFire();
        connect();
        upperDiamond();
        lowerDiamond();
        connect();
        lowerDiamond();
        upperDiamond();
        connect();
        roofAndFire();
    }

    // This method prints out the roof and the fire of the rocket.
    public static void roofAndFire(){
        for(int i = 1; i < NUM * 2; i++){
            for(int j = NUM * 2; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("/");
            }
            System.out.print("**");
            for(int j = 0; j < i; j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    // This method prints out the lines that connect the diamonds' portion, roof, and fire.
    public static void connect(){
        System.out.print("+");
        for(int i = 0; i < NUM * 2; i++){
            System.out.print("=*");
        }
        System.out.println("+");
    }

    // This method prints out the upper portion of the diamond inside the rocket.
    public static void upperDiamond(){
        for(int i = 0; i < NUM; i++){
            System.out.print("|");
            for(int j = NUM - 1; j > i; j--){
                System.out.print(".");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("/\\");
            }
            for(int j = NUM - 1; j > i; j--){
                System.out.print("..");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("/\\");
            }
            for(int j = NUM - 1; j > i; j--){
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

    // This method prints out the lower portion of the diamond inside the rocket.
    public static void lowerDiamond(){
        for(int i = 0; i < NUM; i++){
            System.out.print("|");
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            for(int j = NUM; j > i; j--){
                System.out.print("\\/");
            }
            for(int j = 0; j < i; j++){
                System.out.print("..");
            }
            for(int j = NUM; j > i; j--){
                System.out.print("\\/");
            }
            for(int j = 0; j < i; j++){
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
}
