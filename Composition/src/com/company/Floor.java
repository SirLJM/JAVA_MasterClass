package com.company;

public class Floor {

    private int length;
    private int width;
    private String material;

    public Floor(int length, int width, String material) {
        this.length = length;
        this.width = width;
        this.material = material;
    }

    public int dimensions() {
        return this.length * this.width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String getMaterial() {
        return material;
    }
}
