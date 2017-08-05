package com.originalix.lix.helloandroid;

/**
 * Created by Lix on 2017/8/5.
 */

public class Fruit {

    private String name;

    private int colorID;

    public Fruit(String name, int colorID) {
        this.name = name;
        this.colorID = colorID;
    }

    public String getName() {
        return name;
    }

    public int getColorID() {
        return colorID;
    }
}
