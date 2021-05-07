package org.student;

public class Guardian{
    int id;
    String name;
    Student student;


    public Guardian (int id,String name){
        this.id = id;
        this.name =name;
    }

    public Guardian (Student student){
        
        this.student = student;
      
    }
    


    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    
}