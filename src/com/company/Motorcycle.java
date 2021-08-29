package com.company;

public class Motorcycle extends Vehicle {

    boolean luggage;

    public Motorcycle(int weight,String colour,Engine engine,boolean luggage){
        super(weight,colour,engine);
        this.luggage=luggage;
    }

    public String motorcycle(){
        return "Motorot ima tezina od " + weight + " kg " + ",boja " + colour + ",engine - " + engine.getInfo() + ",bagaz " + luggage;
    }

    @Override
    public void startEngine() {
        System.out.println("Motorot se pali so kluc");
    }

    @Override
    public void openDoor() {
        System.out.println("Motorot nema vrati");
    }
}

