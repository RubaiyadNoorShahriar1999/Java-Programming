import java.util.*;

public class Larger{

    public static void main( String[] args ){

        int a , b  ;

        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the value of two numbers : ");
        a = sc.nextInt();
        b=  sc.nextInt();

        if(a>b)
            System.out.println("The largest number is :" + a);
        else
            System.out.println("The largest number is : "+ b );
    }
}