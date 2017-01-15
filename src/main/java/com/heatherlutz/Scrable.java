package com.heatherlutz;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Scrable {
    public static void main(String[] args) {

        /**
         * 	Each tile in scrabble has a letter, and a frequency of that tile for a total of 100 tiles.
         The exception to this are the blank tiles, which are represented by an underscore.
         Any tiles that have already been used are represented by a string of uppercase letters.

         Distrubution of tiles can be found at: http://scrabblewizard.com/scrabble-tile-distribution/

         When asked for, output the number of tiles remaining in the Scrabble back in descending order. If the number
         of tiles remaining ties for multiple letters, display the letters in alphabetical order. ie:

         10: E
         9: I
         8: A
         7: O
         5: N, R, T
         4: D, L, U
         3: G, S
         2: F, H, P, V, W
         1: B, C, J, K, M, Q, Y, Z, _
         0: X

         If an attempt is made to withdraw tiles that are no longer there, an error message needs to be sent.
         If there are no more of a letter left, if using a list of some sort, remember to null it.


         Needed:
         Bag object that stores all of the scrabble tiles. Contains map, with value of tile as key.
         - Need to make adjustments for a compareTo.
         Tile object that with setter for tile value, and getter/setter for tile count.
         PlayScrabble that contains the actions for:
         - Remove Random Tile
         - Generate Random Tile
         - New Game that clears and generates a new bag of tiles
         - List Remaining Tiles
         - Will need to compare remaining tiles by number remaining, then alphabetically. See compare adjustment
         in the Bag class.
         Tests will need to be written for all of these.

         */
        Scanner scanner = new Scanner(System.in);

        Tile tile;
        Bag bag = new Bag();
        bag.refillBag();

        while(true) {
            System.out.println("Remove a tile from the bag? \n Yes \n Get Remaining Tiles \n Game Over");

            String choice = scanner.nextLine().toUpperCase();
            if(choice.equals("YES")) {
                bag.removeTile();
            } else if(choice.equals("GET REMAINING TILES")) {
                System.out.println("Remaining tiles: ");
                bag.getRemainingTiles();
            } else if(choice.equals("GAME OVER")) {
                bag.refillBag();
                break;
            }else {
                System.out.println("I'm sorry, I did not understand. Please enter your response again.");
            }
        }

    }
}
