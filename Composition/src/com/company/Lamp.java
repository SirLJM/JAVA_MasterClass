package com.company;

public class Lamp {

    private String name;
    private boolean isOn;

    public Lamp(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        System.out.println("Lamp -> turning on");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("Lamp -> turning off");
        isOn = false;
    }
}
