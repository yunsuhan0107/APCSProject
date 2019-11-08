/*
Name: Yunsu Han
Date: October 6, 2019
Class: APCS, E Section
Description: This program simulates creating and crossing off a grocery list.
 */

import java.util.ArrayList;
import java.util.Scanner;

class GroceryList {
    Scanner in = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    // This method introduces the program to the user, shows the menu, and links to other methods.
    public void start(){
            int input = 0;

            System.out.println("This program creates a grocery list. " +
                    "Add, remove, and look at your grocery list!");
            System.out.println("Please enter the numbers! Choose 1 of the following: ");

            // This do-while loop calls other methods and ends when input is the number 5.
            do{
                System.out.println("1. Add an item to your list");
                System.out.println("2. Remove an item on your list");
                System.out.println("3. Replace an item on your list");
                System.out.println("4. Display your list and the total number of items in the list");
                System.out.println("5. Quit\n");
                input = in.nextInt();

                if(input == 1)
                    add();
                else if(input == 2)
                    remove();
                else if(input == 3)
                    replace();
                else if(input == 4)
                    display();
                else if(input == 5)
                    System.out.println("Thank you for using this program!");
                else
                    System.out.println("Please enter the correct number!\n");
            } while(input != 5);

    }

    // This method adds an item to the list.
    public void add(){
        System.out.print("What do you want to add? ");
        String input = in.next();
        list.add(input);
        System.out.println(input + ": Added!");
    }

    // This method removes an item on the list.
    public void remove(){
        System.out.print("What do you want to remove? ");
        String input = in.next();
        list.remove(input);
        System.out.println(input + ": Removed!");
    }

    // This method replaces an item to another one.
    public void replace(){
        System.out.println("What do you want to replace? ");
        System.out.print("First enter the one you want to get rid of, then the one you want to put in: ");
        String remove = in.next();
        String put = in.next();

        // To keep the index of the original item, we get the index and then put the new one there.
        int tmp = list.indexOf(remove);
        list.remove(remove);
        list.add(tmp, put);
        System.out.println(remove + " --> " + put + ": Replaced!");
    }

    // This method shows the items on the list and the number of them.
    public void display(){
        System.out.println("Here is your grocery list: " + list);
        System.out.println("There are " + list.size() + " items in your list!\n");
    }

}
