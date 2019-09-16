package com.company;

public class Wall {

    private String direction;
    private int width;
    private int height;
    private String color;
    private int numberOfDoors;
    private int numberOfWindows;
    private Door door;
    private Window window;

    public Wall(String direction, int width, int height, String color, int numberOfDoors, int numberOfWindows, Door door, Window window) {
        this.direction = direction;
        this.width = width;
        this.height = height;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.door = door;
        this.window = window;
    }

    public int calculateArea() {
        return (this.height * this.width) - (numberOfDoors * getDoor().dimensions() + numberOfWindows * getWindow().dimensions());
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public String getDirection() {
        return direction;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

}
