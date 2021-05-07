package org.main;
import java.util.Scanner;
import org.student.Student;
import org.student.Guardian;
import org.fee.Parking;
import org.fee.Semester;



/*
 * Font Family: Fira Code
 * These are font ligatures
    ------------------------------------------
    |     !=   |   ==   |   ===  |   !==     |
    ------------------------------------------
    |     <=   |   >=   |   =>   |   ==>     |
    ------------------------------------------
    |     /=   |   /==  |   ->   |   -->     |
    ------------------------------------------
    |     ->>  |   />   |   _|_  |   |-      |
    ------------------------------------------
    |     !!   |   ***  |   ||=  |   +++     |
    ------------------------------------------
    |     ++   |   ~@   |   ##   |   ###     |
    ------------------------------------------
    |     %%%  |   ?=   |   ?==  |   ~~      |
    ------------------------------------------
    |     !!!  |   @@@  |   &&   |   ||      |
    ------------------------------------------
*/




public class Main{

    public static void main(String[] args){
        int sc;
        Student  student =new Student( 19395411 ,"Rubaiyad");
        Guardian guardian = new Guardian(19395411, "Nahar");
        Semester semester = new Semester(19395411,"Forth",129500);
        Parking parking =new Parking(19395411,"Toyota",500);

        System.out.println(student.getId() );
        System.out.println(student.getName() );
        System.out.println(guardian.getId() );
        System.out.println(guardian.getName() );
        System.out.println(semester.getId() );
        System.out.println(semester.getName() );
        System.out.println(semester.getAmount() );
        System.out.println(parking.getId());
        System.out.println(parking.getVehicle() );
        System.out.println(parking.getAmount() );

        System.out.println("Enter the id number: ");
        Scanner scanner = new Scanner(System.in);
        sc = scanner.nextInt();

        if(student.getId()==guardian.getId()){
             System.out.println("The Students guardian id is  " + guardian.getId()+" "+ "and the name of the guardian is "+ " "+guardian.getName());

        }


    }
}