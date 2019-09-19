package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class AstonMartin extends Car {

    public AstonMartin(int cylinders) {
        super("Aston Martin", cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ferrari extends Car {

    public Ferrari(int cylinders) {
        super("Ferrari", cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Ford extends Car {

    public Ford(int cylinders) {
        super("Ford", cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {

        Car car = new Car("Car", 3);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        AstonMartin AstonMartin = new AstonMartin(6);
        System.out.println(AstonMartin.startEngine());
        System.out.println(AstonMartin.accelerate());
        System.out.println(AstonMartin.brake());

        Ford Ford = new Ford(4);
        System.out.println(Ford.startEngine());
        System.out.println(Ford.accelerate());
        System.out.println(Ford.brake());

        Ferrari Ferrari = new Ferrari(8);
        System.out.println(Ferrari.startEngine());
        System.out.println(Ferrari.accelerate());
        System.out.println(Ferrari.brake());

    }

}
