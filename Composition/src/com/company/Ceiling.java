package com.company;

public class Ceiling {

    private int width;
    private int length;
    private String color;

    public Ceiling(int width, int length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int dimensions() {
        return this.length * this.width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
