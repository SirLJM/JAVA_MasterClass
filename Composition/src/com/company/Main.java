package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);

	    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27,new Resolution(2540, 1440));
	    Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

	    PC thePc = new PC(theCase,theMonitor,theMotherboard);
	    thePc.powerUp();

	    Door door = new Door(220, 90, "left");
	    Window window = new Window(60, 40);

		Wall wall1 = new Wall("north",200, 270, "grey", 1, 1, door, window);
		Wall wall2 = new Wall("south",200, 270, "grey", 0, 0, door, window);
		Wall wall3 = new Wall("east",300, 270, "grey", 0, 0, door, window);
		Wall wall4 = new Wall("west",300, 270, "grey", 0, 0, door, window);

		Ceiling ceiling = new Ceiling(200, 300, "white");
		Floor floor = new Floor(200, 300, "Oak");

		Bed bed = new Bed(50, 70, 40);
		Lamp lamp = new Lamp("Rado", false);

		Room bedRoom = new Room("bedroom", wall1, wall2, wall3, wall4, floor, ceiling, bed, lamp);

		bedRoom.makeBed();
		bedRoom.getLamp().turnOn();
		System.out.println(bedRoom.sumWallsArea());

    }
}
