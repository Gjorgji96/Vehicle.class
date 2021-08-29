package com.company;

public class Engine {

    double displacement;
    int horsepower;

    public Engine(double displacement,int horsepower){
        this.displacement=displacement;
        this.horsepower=horsepower;
    }
    public Engine(){}

    public String getInfo(){
        return  horsepower + " konjski sili" + " i kubikaza od " + displacement;
    }

}
