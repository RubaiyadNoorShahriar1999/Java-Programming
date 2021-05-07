package org.fee;

public class Semester{
    int id;
    String name;
    double amount ;

    public Semester( int id,String name,double amount){
        this.id = id;
        this.name =name;
        this.amount =amount;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getAmount(){
        return amount;
    }
}