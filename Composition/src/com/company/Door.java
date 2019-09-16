package com.company;

public class Door {

    private int height;
    private int width;
    private String type;

    public Door(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public int dimensions() {
        return this.height * this.width;
    }

}
