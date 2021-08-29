package com.company;

public class Vehicle {

    int weight;
    String colour;
    Engine engine;

    public Vehicle(int weight,String colour,Engine engine){
        this.weight=weight;
        this.colour=colour;
        this.engine=engine;
    }
    public Vehicle(){}




    public void startEngine(){
        System.out.println("Motornoto vozilo se pali so kluc");
    }

    public void openDoor(){
        System.out.println("Motornoto vozilo ima 4 vrati");
    }
}
