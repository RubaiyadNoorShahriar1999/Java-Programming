import java.util.*;

public class Sov2{
    public static void main(String[] args ){
        int a[] = new int[10];
        int  sum =0; 
        double avg ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 10 Integers : ");
        for(int i =0 ; i< a.length ; i++){
            a[i] = sc.nextInt();
        }

        for(int i= 0 ;i <a.length ; i++){
            sum = sum + a[i];
        }

        avg= sum/a.length ;
        System.out.println(" The sum and the average is :"+ sum + " ;" + avg);

        
    }
}