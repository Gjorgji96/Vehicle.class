package com.company;

public class Main {

    public static void main(String[] args) {

        Engine kola = new Engine(1.7,160);
        Engine motorcycle = new Engine(1.2,75);
        Engine truck = new Engine(4.2,190);
        System.out.println(truck.getInfo());
        Motorcycle cross = new Motorcycle(165,"black",motorcycle,true);
        System.out.println(cross.motorcycle());
        Car mercedesAMG = new Car(1200,"black mat",kola,6);
        System.out.println(mercedesAMG.car());
        Truck MAN = new Truck(1500,"white",truck,3000);
        System.out.println(MAN.truck());


    }
}
