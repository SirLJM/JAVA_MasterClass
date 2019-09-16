package com.company;

public class Window {

    private int width;
    private int height;

    public Window(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int dimensions() {
        return this.height * this.width;
    }
}
