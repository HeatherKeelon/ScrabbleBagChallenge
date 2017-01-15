package com.heatherlutz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hlutz on 9/6/16.
 */
public class Bag {
    private static Tile e = new Tile("E", 12);
    private static Tile a = new Tile("A", 9);
    private static Tile i = new Tile("I", 9);
    private static Tile o = new Tile("O", 8);
    private static Tile n = new Tile("N", 6);
    private static Tile r = new Tile("R", 6);
    private static Tile t = new Tile("T", 6);
    private static Tile l = new Tile("L", 4);
    private static Tile s = new Tile("S", 4);
    private static Tile u = new Tile("U", 4);
    private static Tile d = new Tile("D", 4);
    private static Tile g = new Tile("G", 3);
    private static Tile _ = new Tile("_", 2);
    private static Tile b = new Tile("B", 2);
    private static Tile c = new Tile("C", 2);
    private static Tile m = new Tile("M", 2);
    private static Tile p = new Tile("P", 2);
    private static Tile f = new Tile("F", 2);
    private static Tile h = new Tile("H", 2);
    private static Tile v = new Tile("V", 2);
    private static Tile w = new Tile("W", 2);
    private static Tile y = new Tile("Y", 2);
    private static Tile k = new Tile("K", 1);
    private static Tile j = new Tile("J", 1);
    private static Tile x = new Tile("X", 1);
    private static Tile q = new Tile("Q", 1);
    private static Tile z = new Tile("Z", 1);
    private List<Tile> scrabbleBag = new ArrayList<>();
    private int max = 26;
    private int min = 0;

    public Bag(){

    }


    public Tile removeTile() {
        int rand = min + (int)(Math.random() * ((max - min) + 1));
        Tile chosen = scrabbleBag.get(rand);

        chosen.removeATile();
        System.out.println(chosen.getValue() + " was removed from the bag.");

        if (getRemainingTiles() == 0) {
            System.out.println("There are no tiles remaining, you cannot select this option.");
            return null;
        }

        if(chosen.getCount() == 0) {
            scrabbleBag.remove(chosen);
            System.out.println(chosen.getValue() + " has been removed from the list because there are none left.");
            max = max -1;
        }

        return chosen;
    }

    public void emptyBag() {

        scrabbleBag.clear();
    }


    public int getRemainingTiles() {
        int counter = 0;
        Collections.sort(scrabbleBag, Tile.ALPHABETICAL);
        int lineNumber = scrabbleBag.get(0).getCount();

        for(Tile tile: scrabbleBag) {
            counter += tile.getCount();
            if(tile == scrabbleBag.get(0)) {
                System.out.printf(tile.getCount() + ": " + tile.getValue());
            } else if(tile.getCount() != lineNumber) {
                System.out.printf("%n" + tile.getCount() + ": ");
                System.out.printf(tile.getValue());
            } else {
                System.out.printf(", " + tile.getValue());
            }
            lineNumber = tile.getCount();
        }

        if (counter == 0) {
            System.out.println("There are no tiles remaining.");
        } else {
            System.out.println("\n" + "There are " + counter + " tiles remaining in the bag.");
        }
        return counter;
    }

    public List<Tile> refillBag() {
        if(scrabbleBag.size() < 27) {
            emptyBag();
            scrabbleBag.addAll(Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w,
                    x, y, z, _));
            return scrabbleBag;
        }
        return scrabbleBag;
    }
}

