package com.company;

public class Room {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Floor floor;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Floor floor, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.floor = floor;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return this.lamp;
    }

    public void makeBed() {
        System.out.println("Room -> Making bed");
        bed.make();
    }

    public int sumWallsArea() {
        return wall1.calculateArea() + wall2.calculateArea() + wall3.calculateArea() + wall4.calculateArea();
    }
}
