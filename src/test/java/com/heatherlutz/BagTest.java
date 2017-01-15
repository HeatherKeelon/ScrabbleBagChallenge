package com.heatherlutz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hlutz on 10/13/16.
 */
public class BagTest {
    private Bag bag;

    public BagTest() {

        this.bag  = new Bag();
    }

    @Test
    public void getRemainingTiles_fullBag() {
        bag.refillBag();
        int totalTiles = 100;
        int result = bag.getRemainingTiles();
        Assert.assertTrue(totalTiles == result);
    }

    @Test
    public void getRemainingTiles_noTilesRemaining() {
        bag.refillBag();
        for(int i=1; i<=100; i++) {
            bag.removeTile();
        }
        int result = bag.getRemainingTiles();
        Assert.assertTrue(result == 0);
    }

    @Test
    public void removeTile_removeOne() {
        int remaining = 99;
        bag.refillBag();
        bag.removeTile();;
        int result = bag.getRemainingTiles();
        Assert.assertEquals(remaining, result);
    }

    @Test
    public void removeTile_noTilesRemaining() {
        int remaining = 0;
        bag.refillBag();
        for(int i=1; i<=100; i++) {
            bag.removeTile();
        }
        int result = bag.getRemainingTiles();
        Assert.assertEquals(remaining, result);
    }
}
