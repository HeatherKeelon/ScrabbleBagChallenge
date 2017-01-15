package com.heatherlutz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hlutz on 9/6/16.
 */
public class Tile {
    private String value;
    private int count;
    private List<Tile> tileList = new ArrayList<>();

    static final Comparator<Tile> ALPHABETICAL;

    static {
        ALPHABETICAL = new Comparator<Tile>() {
            @Override
            public int compare(Tile o1, Tile o2) {
                if(o1.getCount() < o2.getCount()) {
                    return 1;
                } else if (o1.getCount() > o2.getCount()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Tile(String value, int count) {
        this.value = value;
        this.count = count;
    }

    public String getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }

    public void removeATile() {
        this.count = count -1;
    }

    @Override
    public final boolean equals(Object o) {
        if(o == this) {
            return true;
        }

        if(o instanceof Tile) {
            Tile tile = (Tile) o;

            return this.value == tile.value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + value.hashCode();
        result = 31 * result + count;

        return result;
    }

}
