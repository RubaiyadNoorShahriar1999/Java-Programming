package org.fee;

public class Semester{
    int id;
    String vehicle;
    double amount ;

    public Semester( int id,String name,double amount){
        this.id = id;
        this.vehicle =vehicle;
        this.amount =amount;
    }

    public int getId(){
        return id;
    }

    public String getVehicle(){
        return vehicle;
    }

    public double getAmount(){
        return amount;
    }
}