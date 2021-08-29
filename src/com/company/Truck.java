package com.company;

public class Truck extends Vehicle {

    int towingCapacity;

    public Truck(int weight,String colour,Engine engine,int towingCapacity){
        super(weight, colour, engine);
        this.towingCapacity=towingCapacity;
    }
    public Truck(){}

    @Override
    public void startEngine() {
        System.out.println("Kamionot se startuva so kluc");
    }

    @Override
    public void openDoor() {
        System.out.println("Kaj kamionot se otvaraat dve vrati");
    }
    public String truck(){
        return "Kamionot ima tezina od " + weight + " kg " + ",boja " + colour + ",motor- "
                + engine.getInfo() + ",vlecna sila od " + towingCapacity + " kg";
    }
}
