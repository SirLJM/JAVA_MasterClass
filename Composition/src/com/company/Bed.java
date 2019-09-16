package com.company;

public class Bed {

    private int length;
    private int width;
    private int height;

    public Bed(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void make() {
        System.out.println("Bed -> making");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
