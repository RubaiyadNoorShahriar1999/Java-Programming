import java.util.*;

public class Larger2{

    public static void main( String[] args ){

        int a , b ,c  ;

        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the value of three numbers : ");
        a = sc.nextInt();
        b=  sc.nextInt();
        c = sc.nextInt();

        if( a>b && a>c )
            System.out.println("The largest number is :" + a);
        if(b>a && b>c)
            System.out.println("The largest number is : "+ b);
        if(c>a && c>b)
            System.out.println("The largest number is : " + c);
    }
}