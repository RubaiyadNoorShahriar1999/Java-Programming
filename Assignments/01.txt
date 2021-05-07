import java.util.*;
public class Mme{
    public static void main(String[] args){
        int a,b,sum,sub,div,mul,rem,op, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a & b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("1.Summation  \n 2.Subtraction \n 3.Division \n 4.Multiplication \n 5.Remainder \n  ");
        op = sc.nextInt();
        switch(op){
            case  1 :
                sum = a + b ;
                System.out.println( " Your required answer is : " +sum  );
            break ;

            case 2 :
                sub = a - b ;
                System.out.println( " Your required answer is : " + sub );
            break;

            case 3 :
                 div =a / b ;
                 System.out.println( " Your required answer is : " + div );
            break ;

            case 4 : 
                mul =a * b ;
                System.out.println( " Your required answer is : " + mul );
            break ;

            case 5 : 
                rem = a % b ;
                System.out.println( " Your required answer is : " + rem );
            break ;
        }
        
       
    }



}