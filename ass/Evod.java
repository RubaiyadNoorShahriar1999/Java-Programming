import java.util.*;

public class Evod{
    public static void main(String[] args){
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a = sc.nextInt();
        
         for(int i =0 ; i< 2 ; i++){
                if(a%2== 0){
                      System.out.println("The number is EVEN");
                   }
                else{
                      System.out.println("The number is Odd");
                    }
                  break;
          }

    }
}