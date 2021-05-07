import java.util.Scanner;
import java.io.*;

public class scanp{

    int puppyAge[] = new int[3];
    String puppyName[] = new String[3];

    public  scanp(){
       /*
           *  System.out.println("The name of the Puppy1 is : " + name1);
            * System.out.println("The name of the Puppy2 is : " + name2);
             *System.out.println("The name of the Puppy3 is : " + name3);
        */
        System.out.println("Enter the names of the Puppies: ");
        Scanner sc = new Scanner(System.in);
        for(int i= 0 ; i< puppyName.length ; i++){
             puppyName[i] = sc.nextLine();
             
        }

        System.out.println("Enter the Ages of the Puppies: ");
        // Scanner nc = new Scanner(System.in);
            for(int i= 0 ; i< puppyAge.length ; i++){
                puppyAge[i] = sc.nextInt();
        }

             for(int i= 0 ; i< puppyName.length ; i++){
                 System.out.println("The names of the puppies are : " + puppyName[i] );
        }

        
         /*System.out.println("Enter the Ages of the Puppies: ");
        // Scanner nc = new Scanner(System.in);
            for(int i= 0 ; i< puppyAge.length ; i++){
                puppyAge[i] = sc.nextInt();
        }*/
            for(int i= 0 ; i< puppyAge.length ; i++){
                  System.out.println("The name of the Puppy is : " + puppyAge[i]);
             }
        
    }

  /*  public  String[]  pNames(){
            /*  int i= 0 ;
             *puppyName[i] = name1 ;
             *puppyName[i+1] = name2 ;
             *puppyName[i+2] = name3 ;

            *System.out.println("Enter the names of the Puppies: ");
            *Scanner sc = new Scanner(System.in);
            *for(int i= 0 ; i< puppyName.length ; i++){
             *   puppyName[i] = sc.nextLine();
        *}
         *   return puppyName;
    *}

    *public int[] pAge(){
     *   //System.out.println("The Age of the puppy is : " + puppyAge );
      *  return puppyAge;
    *}

    
*/

    public int sum(){
        int a ,b,c ,sum ;

        System.out.println("Enter the values of the variables: ");

      Scanner cm = new Scanner(System.in);
        a = cm.nextInt();
        b = cm.nextInt();
        c = cm.nextInt();
    
        sum = a+b+c ;

        System.out.println("The value of Sum is :" + sum );
        //System.out.println("Length is : " + binary[a]);


        return sum ; 

    }
    public static void main(String[] args){


       scanp myPuppy = new scanp();    //call kora lagbe na
        myPuppy.sum();

        //int mp[] = new int myPuppy.getName;
       // int mp[] = myPuppy.getAge();
        //myPuppy.setName();
        // myPuppy.getAge();
        //System.out.println("The Name of the Puppy is :"  + myPuppy.setName() );
       /* for(int i=0 ; i< mp.length ; i++){
            System.out.println("The Age of the Puppy is "  + (i+1) + " : "+ mp[i]);

        }*/
        
    }
}