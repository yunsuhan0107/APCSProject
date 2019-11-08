/*
Name: Yunsu Han
Date: October 6, 2019
Class: APCS, E Section
Description: This program allows a user to create his or her own dictionary. The dictionary has words
and their definitions.
 */

import java.util.Scanner;
import java.util.ArrayList;

class Dictionary {
    Scanner in = new Scanner(System.in);
    ArrayList<String> wordList = new ArrayList<>();
    ArrayList<String> defList = new ArrayList<>();

    // This method introduces the program, shows the menu, and links to other methods.
    public void start(){
        int input = 0;

        System.out.println("This is a dictionary. " +
                "Add, remove, change the dictionary with a word and its definition!");
        System.out.println("Please enter the numbers! Choose 1 of the following: ");

        // This loop calls other methods and ends when user puts the number 6.
        do{
            System.out.println("\n1. Add a new word and its definition");
            System.out.println("2. Remove a word and its definition");
            System.out.println("3. Change a definition to a word");
            System.out.println("4. Get the definition of a word");
            System.out.println("5. Display all the words in the dictionary");
            System.out.println("6. Quit\n");
            input = in.nextInt();

            if(input == 1)
                add();
            else if(input == 2)
                remove();
            else if(input == 3)
                change();
            else if(input == 4)
                get();
            else if(input == 5)
                display();
            else if(input == 6)
                System.out.println("Thank you for using our dictionary!");
            else
                System.out.println("Please enter a correct number!\n");
        } while(input != 6);

    }

    // This method adds words on the "wordList" list and
    // adds their definition on the "defList" list.
    public void add(){
        System.out.print("What is the word you want to add? ");
        String word = in.next();
        wordList.add(word);

        System.out.print("What is the definition of it? ");
        in.nextLine();
        String def = in.nextLine();
        defList.add(def);

        System.out.println("Your word is added!");
    }

    // This method removes words on the list
    // and informs the user if the word is not on the list.
    public void remove(){
        System.out.print("What is the word you want to remove? ");
        String word = in.next();
        int targetIndex = wordList.indexOf(word);
        wordList.remove(word);

        // If the word is not on the list, indexOf method returns -1.
        // So, if "targetIndex" is -1, there is no such word.
        if(targetIndex == -1)
            System.out.println("There is no word called \"" + word + ".\"");

        else{
            System.out.println(word + ": Removed!");
            defList.remove(targetIndex); // Also remove the definition of the removed word
        }

    }

    // This method changes the definition of a word.
    // Since we have two separate lists, we need to find the definition of the word with index of it.
    public void change(){
        System.out.print("Enter the word that has the definition you want to change: ");
        String word = in.next();
        int index = wordList.indexOf(word);
        System.out.print("Now, enter the new definition of it: ");
        in.nextLine();
        String newDef = in.nextLine();
        defList.set(index, newDef);
        System.out.println("Definition is changed!");
    }

    // This method gets the definition of a word.
    // This method also uses the index of the word to get the corresponding definition.
    public void get(){
        System.out.print("Enter the word that you want to see the definition: ");
        String word = in.next();
        int index = wordList.indexOf(word);
        if(index == -1)
            System.out.println("There is no word called \"" + word + ".\"");
        else
            System.out.println(defList.get(index));
    }

    // This method shows the words on the dictionary and the number of them.
    public void display(){
        System.out.println("Here are all the words in the dictionary: " + wordList);
        if(wordList.size() == 1)
            System.out.println("There is one word in the dictionary!");
        else
            System.out.println("There are " + wordList.size() + " words in the dictionary!");
    }
}
