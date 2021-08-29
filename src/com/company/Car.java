package com.company;

public class Car extends Vehicle{

    int passengerCapacity;


    public Car(int weight,String colour,Engine engine,int passengerCapacity){
        super(weight,colour,engine);
        this.passengerCapacity=passengerCapacity;
    }
    public Car (){}

    @Override
    public void startEngine() {
        System.out.println("Avtomobilot se startuva so pritiskanje na kopceto start");
    }

    @Override
    public void openDoor() {
        System.out.println("Avtomobilot ima dve vrati");
    }
    public String car(){
        return "Kolata ima tezina od " + weight + " kg " + ",boja " + colour + ",motor- "
                                + engine.getInfo() + ",kapacitet na patnici " + passengerCapacity;
    }
}
